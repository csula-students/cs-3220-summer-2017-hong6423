#Create restaurant food item table
	CREATE TABLE food_item(
		ID integer,
		Name varchar(255),
		Description varchar(255),
		Price double
	);

#Create restaurant order statuses table
	CREATE TABLE Order_Statuses()
		ID = integer,
		Customer_Name varchar(255),
		Create datetime
	);
	
#order food table

	CREATE TABLE Order_Food(
		Order_Id integer,
		Food_Id integer,
		Quantity integer
		);

#Create restaurant cart table
	CREATE TABLE Cart(
		ID integer,
		Customer_Name varchar(255),
		Food_Id integer,
		Quantity integer
	);

#Insert default food items into food items table

	Insert into food_item values(1,'Hamburger', 'A hamburger', 9.99);
	Insert into food_item values(2,'Fries', 'Some fries', 4.99);
	Insert into food_item values(3,'Coke', 'Coke cola', 2.99);

#Insert default order statuses into order statuses table

	Insert into Order_Statuses values(1,'Eric', '2017-07-20 13:35:55');
	Insert into Order_Statuses values(2,'John', '2017-07-22 10:35:55');
	Insert into Order_Statuses values(3,'Jane', '2017-07-22 15:35:55');
	Insert into Order_Statuses values(4,'Alice', '2017-07-22 16:35:55');

# Order to order food table

	Insert into Order_Food values( 1, 1, 1);
	Insert into Order_Food values( 1, 2, 2);
	Insert into Order_Food values( 2, 2, 2);
	Insert into Order_Food values( 2, 3, 1);
	Insert into Order_Food values( 3, 3, 1);
	Insert into Order_Food values( 4, 2, 1);
	Insert into Order_Food values( 4, 3, 2);

# value to cart table
	
	Insert into Cart values(1, 'Anonymous', 1, 2);
	Insert into Cart values(1, 'Anonymous', 2, 1);
	Insert into Cart values(1, 'Anonymous', 2, 1);
	Insert into Cart values(2, 'Mike', 1, 1);
	Insert into Cart values(2, 'Mike', 2, 1);
	Insert into Cart values(3, 'Bob	', 3, 1);

#Update food item name from "Hamburger" to "Salad"
	
	UPDATE food_item
		SET Name = 'Salad'
			WHERE Name ='Hambuger';



#Update customer name from "Jane" to "Doe"

	UPDATE Order_Statuses
		SET Customer_Name = 'Doe'
			WHERE Customer_Name = 'Jane'

#Find out which food item has the most orders

	SELECT food_item.Name,sum(Quantity)
	    FROM Order_Food JOIN food_item
		    WHERE foodItems.ID= Order_Food.Food_Id
			    group by Name 
				    order by sum(Quantity) desc limit 1;

#Find out which food item in least shopping carts

	SELECT food_item.Name,sum(Quantity)
		FROM Cart JOIN food_item 
			WHERE food_item.ID = Cart.ID
				GROUP BY Name ORDER BY sum(Quantity)  asc limit 1; 


#Find out all restaurant food items using SELECT query

	SELECT *
		FROM food_item;
#Find out all restaurant order statuses using SELECT query

	SELECT *
		FROM Order_Statuses;
#Find out the order statuses that is created today

	SELECT *
		FROM Order_Statuses
			WHERE created LIKE '2017-07-22%';

#DELETE restaurant food items table
	DROP TABLE food_item;
#Delete restaurant order statuses table
	DROP TABLE Order_Statuses;
#Delete restaurant cart table
	DROP TABLE Cart;