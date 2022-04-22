# kotlin-orderApp
#Öncelikle bu proje kotlin diliyle yazılmış bir projedir. 
#İçeriğinde Kullanılan Elementler
# ->Edittext, 
# ->Button, 
# ->Imageview,
# ->Texview
# ->Radiogroup ve 
# ->RadioButton

# Kullanılan dependencies ler
#-> implementation 'androidx.appcompat:appcompat:1.4.1'
#-> implementation 'com.google.android.material:material:1.5.0'
#-> implementation 'com.github.bumptech.glide:glide:4.13.0'
#-> implementation 'androidx.constraintlayout:constraintlayout:2.1.3'

# Kullanılan Plugings ler
#-> id 'kotlin-android'
#-> id 'kotlin-android-extensions'  
#-> id 'org.jetbrains.kotlin.android'

# Uygulamadaki gerçekleşen durumlar hakkında kısa bilgiler 
#-> AD SOYAD kısmında eğer geçerli bir isim girilmezse uygulama Toast message ile kullanıcı bilgilendiriliyor
#-> ŞİFRE kısmında eğer geçerli bir şifre girilmezse uygulama Toast message ile kullanıcı bilgilendiriliyor (Şifre en az 8 karakterden oluşmalı)
#-> E-MAİL kısmında eğer geçerli bir email girilmezse uygulama Toast message ile kullanıcı bilgilendiriliyor ( Geçerli email Patterni xxx@yalova.edu.tr) 
#-> Checkbox eğer seçilmediyse kullanıcı bilgilendiriliyor
#-> KAYIT OL butonuna basıldığında ise AD SOYAD bilgileriyle birlikte 2. sayfaya yönlendirme sağlanıyor
#-> 2. Sayfada Glide fonksiyonuyla internet üzerinden bir resim dosyası çekilip gösteriliyor
#-> AD SOYAD bilgileri başında "HOŞGELDİNİZ" yazarak Texview da gösteriliyor
#-> 2 tane ürün listelemesi yapılıp Radiobutton larla menü seçimi yapılabiliyor 
#-> Son olarakta HESAPLA butonuna basıldığında Texview a toplam maliyet yazdırılıyor

#Uygulamamın nasıl kullanıldğını ne işlevleri olduğunu gösteren video yu aşağıda bulabilirsiniz.

https://user-images.githubusercontent.com/60655518/164748234-323c25f4-8de1-4aac-be59-ee3d10ed71b9.mp4

