class Main {
  public static void main(String[] args) {

    // teks yang akan diperiksa
    String teks = "Teknik Informatika merupakan bidang ilmu yang mempelajari bagaimana menggunakan teknologi komputer secara optimal " + "guna menangani masalah transformasi atau pengolahan data dengan proses logika.";

    int spasi = 0, hurufVokal = 0, hurufKonsonan = 0;

    int panjangTeks = teks.length();
    for (int i = 0; i < panjangTeks; i++) {

      // periksa huruf vokal
      char kar = Character.toLowerCase(teks.charAt(i));
      if (kar == 'a' || kar == 'i' || kar == 'u' || kar == 'e' || kar == 'o') {
        hurufVokal++;
      }

      // periksa huruf huruf Konsonan
      if (Character.isLetter(kar)) {
        hurufKonsonan++;
      }

      // periksa spasi
      if (Character.isWhitespace(kar)) {
        spasi++;
      }
    }

    System.out.println(teks);
    System.out.println("Teks terdapat : ");
    System.out.println("Huruf Vokal : " + hurufVokal);
    System.out.println("Huruf Konsonan : " + (hurufKonsonan - hurufVokal));
    System.out.println("Spasi : " + spasi);
  }
}