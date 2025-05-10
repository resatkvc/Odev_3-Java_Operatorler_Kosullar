#  Not Değerine Göre Harf Notu Belirleme

## 📌 Problem Tanımı
Bir programda, kullanıcıdan alınan bir **not değeri**ne göre **harf notu** belirlenmesi gerekmektedir.  
Kullanıcının girdiği notun **0 ile 100 arasında** olduğu varsayılmaktadır.

## ❓ Hangi Koşullu Yapı Tercih Edilmeli?

Bu senaryoda **`if-else if-else`** yapısı tercih edilmelidir.  
Çünkü kullanıcı notu bir **aralık** (örneğin 90-100) içinde değerlendirilmektedir.

### 💡 Neden `if-else if-else` Yapısı?
- Aralık kontrolü gerektiği için,
- Okunabilirliği yüksektir ve koşullar açık şekilde yazılabilir,
- `switch-case` yalnızca sabit değerlere göre çalıştığı için aralıklar için uygun değildir,
- `ternary operator` ise kısa ve basit durumlar için uygundur; çoklu aralıklar için okunabilirliği düşürür.

  # Artırma Operatörünün kod çıktısı
<pre> 
  int e = 12;
  boolean sonuc5 = (e > 10) && (e++ < 15);  
</pre>
