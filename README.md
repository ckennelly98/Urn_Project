# Urn_Project

This project is about drawing a picture of an Urn onto a .txt file named urn.txt. The code is written so that if there is no urn.txt file found, it will create one and then draw the urn. UrnFile.java will draw the picture of the urn onto urn.txt. UrnFile.java can be scalable by adjusting the CHARACTERISTIC_LENGTH variable. Changing the CHARACTERISTIC_LENGTH variable will vary how large the urn is drawn and how many items can be stored in the urn.

The Seller.java file is very similar to the UrnFile, but there is one characteristic that is different. The Seller.java file has been modified for when the urn is drawn. When the urn is drawn, it will randomly pick a character from the filler1 and filler2 strings. in these strings there are characters that symbolize certain monetary items that can be put in the urn, such as Diamonds, Rubies, and Coins. Once the Urn is finished being drawn, the code then reads the urn.txt file finding all the characters that are inside the urn that are either Diamonds, Rubies, or Coins. As the file is read and the Diamonds, Rubies, and Coins are counted, their monetary values are then added up and printed in the console the total price of all the items in the urn, along with all the counts of each item.

The Buyer.java file is the same as Seller.java without the code that draws the urn onto the urn.txt file.
