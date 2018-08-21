SELECT * FROM genin;
CREATE VIEW pogled1 AS
SELECT  ImeNinje,Cakra FROM jounin
WHERE ImeNinje ="Naruto";
CREATE VIEW broj AS 
SELECT Cakra,Ninjutsu,Stamina FROM kage
WHERE Cakra >12;
CREATE PROCEDURE selectNinja  ()
SELECT * FROM kage
WHERE ImeNinje ='Sasuke';
CREATE PROCEDURE `FirstProcedure` ( ime varchar(42))
BEGIN
SELECT ImeNinje  FROM summon
where ime=ImeNinje;
END

CREATE PROCEDURE `FirstProcedure` ( ime varchar(42))

SELECT ImeNinje  FROM summon
where ime=ImeNinje

START TRANSACTION;
DELETE FROM summon  WHERE  idSummon=2;
COMMIT;

delimiter //
 CREATE TRIGGER trigger_genin BEFORE UPDATE ON genin
       FOR EACH ROW
       BEGIN
           IF NEW.Cakra < (SELECT MIN(Cakra) FROM genin WHERE idGenin=NEW.idGenin  )  THEN
               SIGNAL SQLSTATE "50001" SET MESSAGE_TEXT = 'Kada unosite novog nindzu cakra mora da ima minimalnu vrednost 1';
           
           END IF;
       END;//
 delimiter ;
 delimiter //
 CREATE TRIGGER trigger_name BEFORE UPDATE ON genin
       FOR EACH ROW
       BEGIN
           IF char_length(new.`ImeNinje`) <2  THEN
               SIGNAL SQLSTATE "50002" SET MESSAGE_TEXT = 'Ime nindze mora imati 2 slova';
           
           END IF;
       END;//
 delimiter ;

