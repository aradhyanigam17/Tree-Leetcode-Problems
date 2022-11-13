
SELECT name as customers FROM Customers WHERE id not in (SELECT customerId FROM Orders);