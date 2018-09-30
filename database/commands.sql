SELECT * FROM nindza;
CREATE VIEW pogled1 AS
SELECT  ImeNinje,Cakra FROM nindza
WHERE ImeNinje ="Naruto";
CREATE VIEW broj AS 
SELECT Cakra,Ninjutsu,Stamina FROM nindza
WHERE Cakra >12;
CREATE PROCEDURE selectNinja  ()
SELECT * FROM nindza
WHERE ImeNinje ='Sasuke';
CREATE PROCEDURE `FirstProcedure` ( ime varchar(42))
BEGIN
SELECT ImeNinje  FROM nindza
where ime=ImeNinje;
END

CREATE PROCEDURE `FirstProcedure` ( ime varchar(42))

SELECT ImeNinje  FROM nindza
where ime=ImeNinje

START TRANSACTION;
DELETE FROM nindza  WHERE  idSummon=2;
COMMIT;

delimiter //
 CREATE TRIGGER trigger_genin BEFORE UPDATE ON nindza
       FOR EACH ROW
       BEGIN
           IF NEW.Cakra < (SELECT MIN(Cakra) FROM nindza WHERE idNindza=NEW.idNindza  )  THEN
               SIGNAL SQLSTATE "50001" SET MESSAGE_TEXT = 'Kada unosite novog nindzu cakra mora da ima minimalnu vrednost 1';
           
           END IF;
       END;//
 delimiter ;
 delimiter //
 CREATE TRIGGER trigger_name BEFORE UPDATE ON nindza
       FOR EACH ROW
       BEGIN
           IF char_length(new.`ImeNinje`) <2  THEN
               SIGNAL SQLSTATE "50002" SET MESSAGE_TEXT = 'Ime nindze mora imati 2 slova';
           
           END IF;
       END;//
 delimiter ;

