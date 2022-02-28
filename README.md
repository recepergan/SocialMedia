# SocialMedia
1- Authservice ve Userservice ayrı ayrı iki microservice olarak oluşturuldu.
2- iki microservice ayrı ayrı ayağa kaldırıldı. 
3- AuthService de controller,service,repository,entity ler oluşturuldu.
4- Auth-service application-yml de database bağ. için gerekli ayarlamalar yapıldı.
5- dependencies.gradle a validation ve open api eklendi.
6- swagger-ui üzerinden register olunarak veriler kaydedildi ve gerekli dataların geldiği görüldü
7- mapper dependdencies eklendi ve mapper için controler, service ve usermapperda kodlandı
8- Microservicelerin birbirleriyle habaerleşmesi için open feign ekleyerek feignclientla ikiservis arasındaki iletişimi gerçekleştirdik
9- Bi servis bi servise istek atıyo haberleşmelrini sağlıyor
10-Bunu da manager oluşturarak yaptık~~~~
