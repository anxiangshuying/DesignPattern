-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Lun 10 Décembre 2018 à 14:42
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `reservation`
--

-- --------------------------------------------------------

--
-- Structure de la table `autorisation`
--

CREATE TABLE `autorisation` (
  `idMedecin` int(11) NOT NULL,
  `idType` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `autorisation`
--

INSERT INTO `autorisation` (`idMedecin`, `idType`) VALUES
(1, 2),
(1, 3),
(2, 3),
(3, 2);

-- --------------------------------------------------------

--
-- Structure de la table `date`
--

CREATE TABLE `date` (
  `idMedecin` int(11) NOT NULL,
  `dateDoc` timestamp NOT NULL,
  `statut` int(11) DEFAULT NULL COMMENT '0 = Disponible\n1 = En attente de confirmation\n2 = Occupe'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `date`
--

INSERT INTO `date` (`idMedecin`, `dateDoc`, `statut`) VALUES
(1, '2018-12-10 07:00:00', 0),
(1, '2018-12-10 09:00:00', 3),
(1, '2018-12-10 12:00:00', 3),
(1, '2018-12-10 14:00:00', 0),
(1, '2018-12-11 07:00:00', 0),
(1, '2018-12-11 09:00:00', 0),
(1, '2018-12-11 12:00:00', 0),
(1, '2018-12-11 14:00:00', 0);

-- --------------------------------------------------------

--
-- Structure de la table `medecin`
--

CREATE TABLE `medecin` (
  `idMedecin` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `numSecuSoci` int(11) DEFAULT NULL,
  `salaire` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `medecin`
--

INSERT INTO `medecin` (`idMedecin`, `nom`, `prenom`, `numSecuSoci`, `salaire`) VALUES
(1, 'li', 'li', 9876, 3000),
(2, 'er', 'ert', 3456, 2345),
(3, 'term', 'mahu', 238475, 3400),
(4, 'oiu', 'rteui', 234556, 3600),
(5, 'li', 'posuf', 938274, 4000),
(6, 'term', 'svffgs', 32566, 3600),
(7, 'li', 'qwoiu', 892374, 3900);

-- --------------------------------------------------------

--
-- Structure de la table `paiement`
--

CREATE TABLE `paiement` (
  `idPayer` int(11) NOT NULL,
  `idUtili` int(11) NOT NULL,
  `idReser` int(11) NOT NULL,
  `code` int(11) NOT NULL,
  `payerDate` timestamp NOT NULL,
  `numCarte` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `paiement`
--

INSERT INTO `paiement` (`idPayer`, `idUtili`, `idReser`, `code`, `payerDate`, `numCarte`) VALUES
(1, 2, 1, 465, '2018-12-09 14:40:26', ''),
(2, 1, 1, 786, '2018-12-08 23:00:00', '7600065277188'),
(3, 1, 2, 234, '2018-12-08 23:00:00', '12000345'),
(4, 1, 1, 786, '2018-12-08 23:00:00', '7600065277188'),
(5, 1, 3, 567, '2018-12-09 23:00:00', '34679890');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `idreser` int(11) NOT NULL,
  `idUtili` int(11) NOT NULL,
  `idType` int(11) NOT NULL,
  `date` timestamp NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `reservation`
--

INSERT INTO `reservation` (`idreser`, `idUtili`, `idType`, `date`) VALUES
(1, 1, 1, '2018-12-09 14:42:01'),
(2, 2, 1, '2018-12-09 21:55:33'),
(3, 1, 3, '2018-12-09 22:02:18'),
(4, 1, 1, '2018-12-10 14:17:00');

-- --------------------------------------------------------

--
-- Structure de la table `typeanalyse`
--

CREATE TABLE `typeanalyse` (
  `idType` int(11) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `prix` decimal(10,0) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `typeanalyse`
--

INSERT INTO `typeanalyse` (`idType`, `description`, `prix`) VALUES
(1, 'hemogramme', '20'),
(2, 'groupsanguin', '25'),
(3, 'vitessesedimentation', '18');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `idutili` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `numSecuSoci` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`idutili`, `nom`, `prenom`, `numSecuSoci`) VALUES
(1, 'li', 'huajuan', '12345'),
(2, 'de', 'mary', '45904'),
(3, 'rety', 'foun', '34987'),
(4, 'po', 'bole', '8764'),
(5, 'kary', 'hony', '78907'),
(6, 'kuo', 'kuo', '23456'),
(7, 'li', 'yuyue', '493875'),
(8, 'uoip', 'zcxg', '32526'),
(9, 'li', 'lilili', '43436'),
(10, 'huahua', 'huahauhau', '34678'),
(11, 'lala', 'lalala', '09820'),
(12, '', '', ''),
(13, 'uopui', 'wczzb', '346782'),
(14, 'li', 'wewt', '124678');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `autorisation`
--
ALTER TABLE `autorisation`
  ADD PRIMARY KEY (`idMedecin`,`idType`);

--
-- Index pour la table `date`
--
ALTER TABLE `date`
  ADD PRIMARY KEY (`idMedecin`,`dateDoc`);

--
-- Index pour la table `medecin`
--
ALTER TABLE `medecin`
  ADD PRIMARY KEY (`idMedecin`);

--
-- Index pour la table `paiement`
--
ALTER TABLE `paiement`
  ADD PRIMARY KEY (`idPayer`,`idReser`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`idreser`);

--
-- Index pour la table `typeanalyse`
--
ALTER TABLE `typeanalyse`
  ADD PRIMARY KEY (`idType`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`idutili`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `medecin`
--
ALTER TABLE `medecin`
  MODIFY `idMedecin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT pour la table `paiement`
--
ALTER TABLE `paiement`
  MODIFY `idPayer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `idreser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `typeanalyse`
--
ALTER TABLE `typeanalyse`
  MODIFY `idType` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `idutili` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
