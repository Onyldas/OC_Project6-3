-- data.sql

INSERT INTO rating(id, worded)
VALUES
  (1,'1'),(2,'2'),(3,'3'),(4,'4'),(5,'5a'),(6,'5b'),(7,'5c'),(8,'6a'),(9,'6a+'),(10,'6b'),(11,'6b+'),
  (12,'6c'),(13,'6c+'),(14,'7a'),(15,'7a+'),(16,'7b'),(17,'7b+'),(18,'7c'),(19,'7c+'),(20,'8a'),(21,'8a+'),
  (22,'8b'),(23,'8b+'),(24,'8c'),(25,'8c+'),(26,'9a'),(27,'9a+'),(28,'9b'),(29,'9b+'),(30,'9c')
;

INSERT INTO users (id, pseudo, mail, password, age, pro)
VALUES
  (1,'Guigui','guigui@gmail.com','*****',22,true),
  (2,'Alex','alex@gmail.com','******',22,true),
  (3,'Chriss','chriss@gmail.com','****',22,false)
;

INSERT INTO topo (id, titre, departement, resume, id_auteur)
VALUES
  (1,'Pas de Topo', '', '', 1),
  (2,'Escalade à la Réunion','Réunion','Voyagez à travers les plus beaux sites de la Réunion. Grimpez sur plus de 100 sites naturels. A la Réunion, il n''y a pas que les plages.',1),
  (3,'La Bretagne en hauteur','Bretagne','Même dans une région aussi plate que la Bretagne, on retrouve de nombreux sites d''escalade et pas sans beauté.',2),
  (4,'Toujours plus haut','Pyrénées','Quoi de mieux que d''escalader dans une chaîne massive de montagnes ?',1),
  (5,'Chutes en douceur','France','Les plus beaux sites d''escalade près des cascades et des rivières. Attention l''eau ça mouille.',1)
;

INSERT INTO site (id, name, description, date, postal_code, municipality, adresse, cotation_min_id, cotation_max_id, cotation_moyenne_id, altitude, id_topo)
VALUES
  (100,'Piton des neiges','Site naturel proche du sommet du piton des neiges. Après le chalet, continuez tout droit sur à peu près 1km et retrouvez le mur du côté Ouest. (voir photos)',24102014,'97419','Reunion','Piton des Neiges, La Réunion',3,9,6,2895,1),
  (101,'Piton de la Fournaise','Le volcan actif de l''île de la Réunion. Parfait pour découvrir l''endroit. Une vue magnifique. Attention tout de même aux roches volcaniques qui sont très coupantes. Ne pas y aller lorsque le volcan est actif.',18052014,'97420','Reunion','Piton de la Fournaise, La Réunion',2,8,4,2543,1),
  (102,'Colima100','Franckie s’est décarcassé pour vous et vous offre le topo des nouvelles voies équipées dans la ravine des Colimaçons !',11122016,'97416', 'Saint Leu','Les Colimaçons',1,5,3,100,1),
  (103,'Morinda', 'L ensoliellement est présent l après midi sur ce site à deux voies équipés de plaquettes et de relais avec anneaux. Possibilité d’équiper une moulinette depuis le haut.',01012012,'97411','Saint Paul','Saint Paul - Bassin Long',2,10,6,20,1),
  (104,'Bella Vista','Le mur naturel est ensoleillé l après midi et possède une exposition Sud-est. On peut l atteindre après 5min de marche à plat ; le port du casque conseillé, pied des voies sur une petite vire (attention!).',02032012,'97411','Saint Paul','Saint Paul - Bassin Long',1,9,4,20,1)
;

-- Pour insérer facilement du contenu CTRL + J | ins