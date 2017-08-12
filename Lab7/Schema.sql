CREATE TABLE FoodItem(
	Id INTEGER AUTO_INCREMENT,	
	Name VARCHAR(255),
	Description VARCHAR(255),
	Url VARCHAR(255),
	price VARCHAR(255),
);


INSERT INTO FoodItem(id, name, description, url, price)
(1,"Bibimbap","Rice, Beef, Vegetable, Egg","http://www.danjee.com.au/home/wp-content/themes/theme/img/menu.png","$9.99")
(2,"Grilled Back Ribs", "Pork Back Ribs, Cheese, Corn and Egg", "http://d2ciprw05cjhos.cloudfront.net/files/v3/styles/gs_large/public/images/17/03/mukja2.jpg?itok=qcTrrlPG", "$15.99")
(3,"Beef sasimi", "Beef, Egg(yolk), sesame oil", "http://assets.coolhunting.com/coolhunting/2015/07/08/large_oiji-korean-restaurant-nyc-beef-tartare-2.jpg", "$19.99");

CREATE TABLE Order(

	Id INTEGER AUTO_INCREMENT,	
	Name VARCHAR(255),
	Description VARCHAR(255),
	Url VARCHAR(255),
	price VARCHAR(255),
	CustomerName VARCHAR(255)
)
INSERT INTO Order(id, name, description, url, price,customername)
(1,"Bibimbap","Rice, Beef, Vegetable, Egg","http://www.danjee.com.au/home/wp-content/themes/theme/img/menu.png","$9.99","Hong")
(2,"Grilled Back Ribs", "Pork Back Ribs, Cheese, Corn and Egg", "http://d2ciprw05cjhos.cloudfront.net/files/v3/styles/gs_large/public/images/17/03/mukja2.jpg?itok=qcTrrlPG", "$15.99","Choi")
(3,"Beef sasimi", "Beef, Egg(yolk), sesame oil", "http://assets.coolhunting.com/coolhunting/2015/07/08/large_oiji-korean-restaurant-nyc-beef-tartare-2.jpg", "$19.99","Nick");


