-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Facultad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Facultad` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Facultad` (
  `idFacultad` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idFacultad`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Estudiante`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Estudiante` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Estudiante` (
  `idestudiante` INT UNSIGNED NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `gpa` DOUBLE NOT NULL DEFAULT 0,
  `numerocreditos` DOUBLE NOT NULL DEFAULT 0,
  `Facultad_idFacultad` INT NOT NULL,
  PRIMARY KEY (`idestudiante`),
  INDEX `fk_Estudiante_Facultad_idx` (`Facultad_idFacultad` ASC) VISIBLE,
  CONSTRAINT `fk_Estudiante_Facultad`
    FOREIGN KEY (`Facultad_idFacultad`)
    REFERENCES `mydb`.`Facultad` (`idFacultad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
