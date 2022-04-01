                                                           ORM ?

Object Relational Mapping(Nesne İlişkisel Eşleme)

ORM toolları nesne tabanlı programlamada bulunan objeler ile veritabanı sistemimizdeki tablolar arasında köprü görevi kurulmasını sağlar.

Objeleri ilişkisel veritabanında mapping yapmaya yarar.

ORM toollarının kullanımının en büyük avantajı OOP’da yer alan inheritance, polymorphism gibi konseptleri veritabanımız ile kolaylıkla kullanabilmektir.

Ayrıca bazı durumlarda projelerde SQL sorguları yazılımcıya büyük yük olabiliyor. 

Özellikle proje büyüdüğünde bu işlemler zorlaşıyor.

ORM toollarından önce yazılımcılar kendileri objeleri veritabanındaki tablolarla eşleştirecek kodlar yazıyorlardı.

Hibernate gibi toollar yazılımcıları bu yükten kurtardı. 

Burada bir not: ORM bu konseptin adıdır, bir araç değildir. 

Hibernate bir ORM aracıdır ve EclipseLink, OpenJPA, TopLink gibi birçok farklı ORM aracı bulunmaktadır.

Hibernate, Java dünyasındaki popüler ORM araçlarından biridir.

                                                JPA ?
(Java Persistence API)  (Java kalıcılık API)

JPA, Java uygulamarımızdaki ilişkisel veritabanının yönetimini tanımlayan bir arayüzdür. 

Tek başına kullanımı söz konusu değildir.

JPA ile ORM toolları bir standart ile kontrol altına alınmış oldu. JPA javax.persistence paketi içerisinde tanımlanmıştır.

Hibernate, EclipseLink gibi ORM toolları bir JPA implementasyonudur.

JPA standardı sayesinde ORM toolları arasında kolaylıkla geçiş yapabiliriz.

Çünkü JPA kullanımını öğrendikten sonra diğer ORM toolları da bu standart üzerine geliştirilmiştir.

                                           ENTİTY ?

Veritabanında kalıcı olacak nesneye Entity denir. 

Nesnenin entity sayılabilmesi ve veritabanı tarafından tanınabilmesi için class tanımının hemen üstünde “@Entity” annotation ile tanımlanmalıdır.

Entity sınıfımız bir Java POJO sınıfıdır. Entity annotation ile tanımlanmış sınıf inner class olamaz ya da final olarak tanımlanamaz.

Özetle bir Entity, veritabanımızda yer alan tablomuzdaki bir satıra denk geliyor. Veritabanımızdaki satırların tamamı da entity set oluyor.
