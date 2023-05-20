-- MariaDB dump 10.19  Distrib 10.5.18-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: lenovo    Database: gedem
-- ------------------------------------------------------
-- Server version	5.7.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `creneau`
--

DROP TABLE IF EXISTS `creneau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `creneau` (
  `idCreneau` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `dateCreneau` date NOT NULL,
  `heureDebut` time NOT NULL,
  `heureFin` time NOT NULL,
  `duree` varchar(6) NOT NULL,
  `am_pm` tinyint(1) NOT NULL COMMENT '0 = matin\r\n1 = apres-midi',
  `idFormation` int(11) unsigned DEFAULT NULL,
  `idMatiere_Formation` int(11) unsigned DEFAULT NULL,
  `infos` varchar(100) DEFAULT NULL COMMENT 'infos changements de salles, BTS blanc, etc',
  PRIMARY KEY (`idCreneau`),
  KEY `idFormation` (`idFormation`),
  KEY `idMatiere_idFormation` (`idMatiere_Formation`),
  CONSTRAINT `creneau_ibfk_1` FOREIGN KEY (`idFormation`) REFERENCES `formation` (`idFormation`),
  CONSTRAINT `creneau_ibfk_2` FOREIGN KEY (`idMatiere_Formation`) REFERENCES `df_matiere_formation` (`idMatiere_Formation`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `creneau`
--

LOCK TABLES `creneau` WRITE;
/*!40000 ALTER TABLE `creneau` DISABLE KEYS */;
INSERT INTO `creneau` VALUES (69,'2022-08-29','08:30:00','12:00:00','03:30',1,NULL,NULL,NULL),(70,'2022-08-29','13:30:00','17:00:00','03:30',2,NULL,NULL,NULL),(71,'2022-08-29','08:30:00','12:00:00','03:30',1,NULL,NULL,NULL),(72,'2022-08-29','13:30:00','17:00:00','03:30',2,NULL,NULL,NULL),(73,'2022-08-29','08:30:00','12:00:00','03:30',1,NULL,NULL,NULL),(74,'2022-08-29','13:30:00','17:00:00','03:30',2,NULL,NULL,NULL),(75,'2022-08-29','08:30:00','12:00:00','03:30',1,NULL,NULL,NULL),(76,'2022-08-29','13:30:00','17:00:00','03:30',2,NULL,NULL,NULL);
/*!40000 ALTER TABLE `creneau` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `df_formateur_formation`
--

DROP TABLE IF EXISTS `df_formateur_formation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `df_formateur_formation` (
  `idFormateur_Formation` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idFormateur` int(11) unsigned NOT NULL,
  `idFormation` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idFormateur_Formation`),
  KEY `idFormateur` (`idFormateur`),
  KEY `idFormation` (`idFormation`),
  CONSTRAINT `df_formateur_formation_ibfk_1` FOREIGN KEY (`idFormateur`) REFERENCES `h_personne_formateur` (`idFormateur`),
  CONSTRAINT `df_formateur_formation_ibfk_2` FOREIGN KEY (`idFormation`) REFERENCES `formation` (`idFormation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `df_formateur_formation`
--

LOCK TABLES `df_formateur_formation` WRITE;
/*!40000 ALTER TABLE `df_formateur_formation` DISABLE KEYS */;
/*!40000 ALTER TABLE `df_formateur_formation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `df_formateur_matiere`
--

DROP TABLE IF EXISTS `df_formateur_matiere`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `df_formateur_matiere` (
  `idFormateur_Matiere` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idFormateur` int(11) unsigned NOT NULL,
  `idMatiere` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idFormateur_Matiere`),
  KEY `idFormateur` (`idFormateur`),
  KEY `idMatiere` (`idMatiere`),
  CONSTRAINT `df_formateur_matiere_ibfk_1` FOREIGN KEY (`idFormateur`) REFERENCES `h_personne_formateur` (`idFormateur`),
  CONSTRAINT `df_formateur_matiere_ibfk_2` FOREIGN KEY (`idMatiere`) REFERENCES `matiere` (`idMatiere`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `df_formateur_matiere`
--

LOCK TABLES `df_formateur_matiere` WRITE;
/*!40000 ALTER TABLE `df_formateur_matiere` DISABLE KEYS */;
INSERT INTO `df_formateur_matiere` VALUES (1,9,3),(2,10,2),(3,11,4),(4,16,1),(5,17,5),(6,18,1);
/*!40000 ALTER TABLE `df_formateur_matiere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `df_matiere_formation`
--

DROP TABLE IF EXISTS `df_matiere_formation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `df_matiere_formation` (
  `idMatiere_Formation` int(11) unsigned NOT NULL,
  `idMatiere` int(11) unsigned NOT NULL,
  `idFormation` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idMatiere_Formation`),
  KEY `idMatiere` (`idMatiere`),
  KEY `idFormation` (`idFormation`),
  CONSTRAINT `df_matiere_formation_ibfk_1` FOREIGN KEY (`idMatiere`) REFERENCES `matiere` (`idMatiere`),
  CONSTRAINT `df_matiere_formation_ibfk_2` FOREIGN KEY (`idFormation`) REFERENCES `formation` (`idFormation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `df_matiere_formation`
--

LOCK TABLES `df_matiere_formation` WRITE;
/*!40000 ALTER TABLE `df_matiere_formation` DISABLE KEYS */;
/*!40000 ALTER TABLE `df_matiere_formation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `df_stagiaire_formation`
--

DROP TABLE IF EXISTS `df_stagiaire_formation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `df_stagiaire_formation` (
  `idStagiaire_Formation` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idStagiaire` int(11) unsigned NOT NULL,
  `idFormation` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idStagiaire_Formation`),
  KEY `idStagiaire` (`idStagiaire`),
  KEY `idFormation` (`idFormation`),
  CONSTRAINT `df_stagiaire_formation_ibfk_1` FOREIGN KEY (`idStagiaire`) REFERENCES `h_personne_stagiaire` (`idStagiaire`),
  CONSTRAINT `df_stagiaire_formation_ibfk_2` FOREIGN KEY (`idFormation`) REFERENCES `formation` (`idFormation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `df_stagiaire_formation`
--

LOCK TABLES `df_stagiaire_formation` WRITE;
/*!40000 ALTER TABLE `df_stagiaire_formation` DISABLE KEYS */;
/*!40000 ALTER TABLE `df_stagiaire_formation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formation`
--

DROP TABLE IF EXISTS `formation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `formation` (
  `idFormation` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nomFormation` varchar(30) NOT NULL,
  `dateDebut` date NOT NULL,
  `dateFin` date NOT NULL,
  PRIMARY KEY (`idFormation`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formation`
--

LOCK TABLES `formation` WRITE;
/*!40000 ALTER TABLE `formation` DISABLE KEYS */;
INSERT INTO `formation` VALUES (1,'BTS SIO option SLAM','2022-08-29','2023-06-22'),(2,'Secrétariat','2022-12-05','2023-03-10'),(3,'Prépa-Clés Anglais','2023-04-03','2023-03-17');
/*!40000 ALTER TABLE `formation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_personne_administratif`
--

DROP TABLE IF EXISTS `h_personne_administratif`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_personne_administratif` (
  `idAdministratif` int(11) NOT NULL AUTO_INCREMENT,
  `idPersonne` int(11) unsigned NOT NULL,
  `fonction` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idAdministratif`),
  KEY `idPersonne` (`idPersonne`),
  CONSTRAINT `h_personne_administratif_ibfk_1` FOREIGN KEY (`idPersonne`) REFERENCES `personne` (`idPersonne`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_personne_administratif`
--

LOCK TABLES `h_personne_administratif` WRITE;
/*!40000 ALTER TABLE `h_personne_administratif` DISABLE KEYS */;
INSERT INTO `h_personne_administratif` VALUES (2,1,'secrétaire'),(3,3,'directeur');
/*!40000 ALTER TABLE `h_personne_administratif` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_personne_formateur`
--

DROP TABLE IF EXISTS `h_personne_formateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_personne_formateur` (
  `idFormateur` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idPersonne` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idFormateur`),
  KEY `idPersonne` (`idPersonne`),
  CONSTRAINT `h_personne_formateur_ibfk_1` FOREIGN KEY (`idPersonne`) REFERENCES `personne` (`idPersonne`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_personne_formateur`
--

LOCK TABLES `h_personne_formateur` WRITE;
/*!40000 ALTER TABLE `h_personne_formateur` DISABLE KEYS */;
INSERT INTO `h_personne_formateur` VALUES (9,2),(10,5),(11,6),(16,38),(17,39),(18,40);
/*!40000 ALTER TABLE `h_personne_formateur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_personne_stagiaire`
--

DROP TABLE IF EXISTS `h_personne_stagiaire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_personne_stagiaire` (
  `idStagiaire` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idPersonne` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idStagiaire`),
  KEY `idPersonne` (`idPersonne`),
  CONSTRAINT `h_personne_stagiaire_ibfk_1` FOREIGN KEY (`idPersonne`) REFERENCES `personne` (`idPersonne`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_personne_stagiaire`
--

LOCK TABLES `h_personne_stagiaire` WRITE;
/*!40000 ALTER TABLE `h_personne_stagiaire` DISABLE KEYS */;
INSERT INTO `h_personne_stagiaire` VALUES (16,2),(17,2),(18,2),(19,2),(20,2),(21,2),(22,2),(23,2),(24,2),(13,3),(1,4),(25,4),(12,25),(9,41),(10,42),(11,43);
/*!40000 ALTER TABLE `h_personne_stagiaire` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `h_signatureformateur`
--

DROP TABLE IF EXISTS `h_signatureformateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `h_signatureformateur` (
  `idSignatureFormateur` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idSignatureStagiaire` int(11) unsigned NOT NULL,
  `idFormateur_Formation` int(11) unsigned NOT NULL,
  `present` enum('0','1','2') NOT NULL DEFAULT '0' COMMENT '0= par défaut\r\n1= présent\r\n2= absent',
  PRIMARY KEY (`idSignatureFormateur`),
  KEY `idSignatureStagiaire` (`idSignatureStagiaire`),
  KEY `idFormateur_Formation` (`idFormateur_Formation`),
  CONSTRAINT `h_signatureformateur_ibfk_1` FOREIGN KEY (`idFormateur_Formation`) REFERENCES `df_formateur_formation` (`idFormateur_Formation`),
  CONSTRAINT `h_signatureformateur_ibfk_2` FOREIGN KEY (`idSignatureStagiaire`) REFERENCES `signaturestagiaire` (`idSignatureStagiaire`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `h_signatureformateur`
--

LOCK TABLES `h_signatureformateur` WRITE;
/*!40000 ALTER TABLE `h_signatureformateur` DISABLE KEYS */;
/*!40000 ALTER TABLE `h_signatureformateur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matiere`
--

DROP TABLE IF EXISTS `matiere`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matiere` (
  `idMatiere` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `intituleMatiere` varchar(30) NOT NULL,
  `commentMatiere` varchar(60) NOT NULL,
  PRIMARY KEY (`idMatiere`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matiere`
--

LOCK TABLES `matiere` WRITE;
/*!40000 ALTER TABLE `matiere` DISABLE KEYS */;
INSERT INTO `matiere` VALUES (1,'Français','Culture générale'),(2,'Mathématiques','Maths appliquées à l\'informatique'),(3,'Programmation',''),(4,'Système et réseaux - Linux','Bloc 1'),(5,'Anglais',''),(6,'Algorithmie','Maths appliquées à l\'informatique'),(7,'Système et réseaux - Windows','Bloc 1');
/*!40000 ALTER TABLE `matiere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personne`
--

DROP TABLE IF EXISTS `personne`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personne` (
  `idPersonne` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idRole` int(11) unsigned NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(35) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `tel` varchar(13) DEFAULT NULL,
  `login` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idPersonne`),
  KEY `idRole` (`idRole`),
  CONSTRAINT `personne_ibfk_1` FOREIGN KEY (`idRole`) REFERENCES `role` (`idRole`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personne`
--

LOCK TABLES `personne` WRITE;
/*!40000 ALTER TABLE `personne` DISABLE KEYS */;
INSERT INTO `personne` VALUES (1,1,'Calment','Jeanne ','jeanne.Calment@free.fr','0234627312','jcalment','jcalment'),(2,2,'Gilmour','David','d.gilmour@darkside.uk','0294571624','dgilmour','dgilmour'),(3,1,'Tanaka','Kane  ','Kane.Tanaka@orange.fr','0134327313','ktanaka','ktanaka'),(4,3,'Knauss','Sarah','sarah.knauss@yahoo.fr','0234627312','sknauss','sknauss'),(5,2,'Beard','Mathew','mat.b@gmail.com','0234627241','mbeard','mbeard'),(6,2,'Richard','Pierre','pierre.richard@free.fr','013462737','prichard','prichard'),(25,3,'Weasley','Ginny','g.weasley@poudlard.com','','gweasley','gweasley'),(38,2,'Sand','George','g.sand@free.fr',NULL,'gsand','gsand'),(39,2,'Dalle','Béatrice','b.dalle@yahoo.bzh',NULL,'bdalle','bdalle'),(40,2,'de Gouges','Olympes','o.degrouges@free.fr',NULL,'odegouges','odegouges'),(41,3,'Potter','Harry','h.potter@poudlard.com',NULL,'hpotter','hpotter'),(42,3,'Weasley','Ron','ronaldb.weasley@poudlard.com',NULL,'ronweasley','rweasley'),(43,3,'Granger','Hermione','h.granger@poudlard.com','0294571624','hgranger','hgranger'),(44,1,'admin','Istrateur','mail@admin.fr','0298341398','a','a'),(45,2,'Form','Ateur','mail@formateur.fr','0298341328','f','f'),(46,3,'Sta','Giaire','mail@stagiaire.fr','0198341328','s','s'),(77,3,'greg','uiop','greg@check.fr','02.98.59.02.','popo','popo'),(78,3,'stagiaire_nom','stagiaire_prenom','stag@stag.fr','null','stagiaire','stagiaire'),(79,2,'formateur_nom','formateur_prenom','form@form.fr','null','formateur','formateur'),(80,1,'admin_nom','admin_prenom','admin@fadmin.fr','null','admin','admin');
/*!40000 ALTER TABLE `personne` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `idRole` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nomRole` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idRole`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Admin'),(2,'Formateur'),(3,'User');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signaturestagiaire`
--

DROP TABLE IF EXISTS `signaturestagiaire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `signaturestagiaire` (
  `idSignatureStagiaire` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `idStagiaire_Formation` int(11) unsigned NOT NULL,
  `idCreneau` int(11) unsigned NOT NULL,
  `present` tinyint(1) NOT NULL COMMENT '0 : par défaut (émargement pas fait)\r\n1 : émargement présent',
  PRIMARY KEY (`idSignatureStagiaire`),
  KEY `idCreneau` (`idCreneau`),
  KEY `idStagiaire_idFormation` (`idStagiaire_Formation`),
  CONSTRAINT `signaturestagiaire_ibfk_1` FOREIGN KEY (`idStagiaire_Formation`) REFERENCES `df_stagiaire_formation` (`idStagiaire_Formation`),
  CONSTRAINT `signaturestagiaire_ibfk_2` FOREIGN KEY (`idCreneau`) REFERENCES `creneau` (`idCreneau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signaturestagiaire`
--

LOCK TABLES `signaturestagiaire` WRITE;
/*!40000 ALTER TABLE `signaturestagiaire` DISABLE KEYS */;
/*!40000 ALTER TABLE `signaturestagiaire` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-20 20:39:25
