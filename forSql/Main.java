package forSql;

public class Main {

	public static void main(String[] args) {
//		//ANSII Standardı
		//case insensitive (Büyük ve küçük harf duyarsız)
		// alias = takma ad
		//Select  (seç)
		//where (koşul)
		// order by (sırala)
		// count(*) ürün sayısını verir
		// asc –ascending(artarak) / desc –descending(azalarak)
		// group by (ayrı ayrı grupla)
		// inner join (birleştir)
		// left join (solda olup sağda olmayan)
		// [Order details] Köşeli parantez 2 sözcüğü tek bir sözcük grubu olarak gösterir.
		//null (data yok)
//		
//		SELECT * FROM Customers;
//		Customers tablosundaki bütün sütunları getir.
//		SELECT ContactName, City from Customers;
//		
//		SELECT ContactName Adi, City sehir from Customers; (Alias(takma ad) ile çağırılır.)
//		SELECT * from Customers where City = 'London'
//		where(koşul)
//		
//		SELECT * from Products where categoryId=1
//		SELECT * from Products where categoryId=1 or categoryId=3
//		Or : ya da (Çağırılan iki bilgiden birisi de yeterli olabilir)
//		
//		SELECT * from Products where categoryId=1 and Price>=10
//		And ( Çağırılan iki bilgi de istenir)
//		
//		SELECT * from Products order by ProductName
//		Ürünleri ProductName e göre sırala (order by)
//		
//		SELECT * from Products order by CategoryId
//		
//		SELECT * from Products order by CategoryId, ProductName
//		(CategoryId ye göre sıralarken, ProductName leri de sırayla göster)
//		
//		SELECT * from Products order by Price asc –ascending
//		asc –ascending (artarak) e ticaret sitelerindeki filtre yapısında bulunan fiyatı artarak listele komutu)
//		(Bu özellik default olarak bulunur, ayrıca as yazmaya gerek yoktur.)
//		
//		SELECT * from Products order by Price gibi….
//		
//		SELECT * from Products order by Price desc --descending
//		--descending (fiyatı azalan, pahalıdan - ucuza)
//		
//		SELECT * from Products where categoryId=1 order by Price desc
//		(categoryId leri 1 olan ürünleri pahalıdan ucuza sıralar)
//		
//		SELECT count(*)from Products
//		(Ürün sayısını verir)
//		
//		SELECT count(*)from Products where CategoryId=2
//		CategoryId si 2 olan ürünlerin sayısını verir
//		
//		SELECT count(*)Adet from Products where CategoryId=2
//		Adet (alias = takma ad) ile sayıyı verir.
//		
//		SELECT categoryId, count(*) from Products group by CategoryId
//		Her bir grup elemanının, ayrı ayrı categoryId lerini sıralar ve ayrı olarak başka bir sütunda ürün sayılarını da verir.
//		
//		SELECT categoryId, count(*) from Products group by CategoryId having count(*)<10
//		Ürün sayısı 10 dan az olan kategorileri listele
//		
//		SELECT categoryId, count(*) from Products where Price>20 group by CategoryId having count(*)<10
//		Ürün sayısı 10 dan az olan ve Price asi 20 den büyük olan kategorileri listele (Önce where komutu çalışır)
//		
//		SELECT Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName from Products inner join Categories on Products.CategoryId = Categories.CategoryId
//		
//		--DTO Data Transformation object (C#)
//		
//		SELECT Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName from Products inner join Categories on Products.CategoryId = Categories.CategoryId where Products.Price>10
//		(Ürünlerden fiyat 10 da büyük olanlar için onu kategorilerle join et ve bana getir)
//		Önemli not: ‘’İnner join’’, sadece 2 tabloda da eşleşenleri bir araya getirebilir. Eşleşmeyen datayı geitrmez.
//
//		SELECT * from Products p left join Orderdetails od 
//		on p.productId = od.ProductId
//		[Order details] yerine w3schools’ da Orderdetails olarak yazdık.
//		Hiç satış yapamadığımız ürünler nelerdir? Kampanya yapalım da o ürünleri elden çıkaralım.
//		Solda olup sağda olmayanları da getir. (Ürünler tablosunda var ama hiç satışı yok)
//		
//		SELECT * from Customers c left join Orders o
//		on c.CustomerId = o.CustomerId
//		where o.customerId is null (“is null” sorgulamasını primary key’ e uygularız, çünkü diğer tablolarda sipariş olmasına rağmen, null olan başka sütunları da gösterebilir.
//
//		SELECT * from Products p inner join OrderDetails od
//		on p.ProductId = od.ProductId
//		inner join Orders o 
//		on o.orderId = od.orderId
//		İki ayrı tablodaki eşit olan dataları çağırdık.		
	}

}
