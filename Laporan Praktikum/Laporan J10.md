# LAPORAN JOBSHEET 10 PRAKTIKUM ALGORITMA DAN STRUKTUR DATA

Dibuat oleh : <p>
Yasmine Navisha Andhani <p>
1F D4 Teknik Informatika <p>
2141720047 <p>

# 2. Praktikum 
## 2.1 Pembuatan Single Linked List
1. Pada Project StrukturData yang sudah dibuat pada Minggu sebelumnya, buat package dengan nama minggu11
2. Tambahkan class-class berikut:
a. Node.java
b. SingleLinkedList.java
c. SLLMain.java
3. Implementasi class Node <p>
<img src="J10 - 2.1 (3).PNG"> 
4. Tambahkan atribut pada class SingleLinkedList <p>
<img src="J10 - 2.1 (4).PNG"> 
5. Sebagai langkah berikutnya, akan diimplementasikan method-method yang terdapat pada SingleLinkedList
6. Tambahkan method isEmpty() <p>
<img src="J10 - 2.1 (6).PNG"> 
7. Implementasi method untuk mencetak dengan menggunakan proses traverse. <p>
<img src="J10 - 2.1 (7).PNG"> 
8. Implementasikan method addFirst() <p>
<img src="J10 - 2.1 (8).PNG">
9. Implementasikan method addLast(). <p>
<img src="J10 - 2.1 (9).PNG">
10. Implementasikan method insertAfter, untuk memasukkan node yang memiliki data input setelah node yang memiliki data key. <p>
<img src="J10 - 2.1 (10).PNG">
11. Tambahkan method penambahan node pada indeks tertentu. <p>
<img src="J10 - 2.1 (11).PNG">
12. Pada class SLLMain, buatlah fungsi main, kemudian buat object dari class SingleLinkedList. <p>
<img src="J10 - 2.1 (12).PNG">
13. Tambahkan Method penambahan data dan pencetakan data di setiap penambahannya agar terlihat perubahannya. <p>
<img src="J10 - 2.1 (13).PNG">

## 2.1.1 Verifikasi Hasil Percobaan
<img src="J10 - 2.1.1.PNG">

## 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
> : Karena belum mengisikan data, atau bisa dibilang method print saat masuk ke pemilihan masuk ke pilihan if(isEmpty()).
2. Pada step 10, jelaskan kegunaan kode berikut <p>
<img src="J10 - 2.1.2 (2).PNG">
> : Jika data yang sudah ada pada linked list sama dengan variabel key, maka data yang kita isi = data linked list berikutnya.
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut <p>
<img src="J10 - 2.1.2 (3).PNG">
> : Jika data setelah dan setelahnya lagi adalah kosong, maka variable tail = data berikutnya, atau bisa dibilang kita dalam kondisi menginputkan data sebelum indeks terkahir (tail).

# 2.2 Modifikasi Elemen pada Single Linked List
## 2.2.1 Langkah - langkah Percobaan
1. Implementasikan method untuk mengakses data dan indeks pada linked list
2. Tambahkan method untuk mendapatkan data pada indeks tertentu pada class Single Linked List <p>
<img src="J10 - 2.2.1 (2).PNG">
3. Implementasikan method indexOf <p>
<img src="J10 - 2.2.1 (3).PNG">
4. Tambahkan method removeFirst pada class SingleLinkedList <p>
<img src="J10 - 2.2.1 (4).PNG">
5. Tambahkan method untuk menghapus data pada bagian belakang pada class 
SingleLinkedList <p>
<img src="J10 - 2.2.1 (5).PNG">
6. Sebagai langkah berikutnya, akan diimplementasikan method remove <p>
<img src="J10 - 2.2.1 (6).PNG">
7. Implementasi method untuk menghapus node dengan menggunakan index. <p>
<img src="J10 - 2.2.1 (7).PNG">
8. Kemudian, coba lakukan pengaksesan dan penghapusan data di method main pada class SLLMain dengan menambahkan kode berikut <p>
<img src="J10 - 2.2.1 (8).PNG">
9. Method SLLMain menjadi: <p>
<img src="J10 - 2.2.1 (9).PNG">
10. Jalankan class SLLMain

## 2.2.2 Verifikasi Hasil Percobaam
<img src="J10 - 2.2.2.PNG">

## 2.2.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
> : Untuk mengehentikan proses atau operasi dari program tersebut.
2. Jelaskan kegunaan kode dibawah pada method remove <p>
<img src="J10 - 2.2.3 (2).PNG">
> : menghilangkan data setelah (temp.next.data) dengan data setelah (temp.next.data) berikutnya lagi.
3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud masing-masing kembalian tersebut!
> : Deklarasi variable index bertipe interger dengan nilai 0, ketika alamat tidak kosong dan data tidak sama dengan variable key maka alamat menajadi alamat selanjutnya (lanjut ke data berikutnya) dan increment variable index, kemudian jika alamat adalah kosong maka menjadi -1, selain itu kembalikan nilai index.

# 3. Tugas
1. Buat method insertBefore untuk menambahkan node sebelum keyword yang diinginkan <p>
<img src="J10 - 3 (1).PNG"> <p>
<img src="J10 - 3 (1a).PNG"> <p>
<img src="J10 - 3 (1b).PNG">
2. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data.<p>
<img src="J10 - 3 (2).PNG"> <p>
<img src="J10 - 3 (3).PNG"> <p>
<img src="J10 - 3 (3a).PNG"> <p>
<img src="J10 - 3 (3b).PNG"> <p>
<img src="J10 - 3 (3c).PNG"> <p>
<img src="J10 - 3 (3d).PNG"> <p>
<img src="J10 - 3 (3e).PNG"> <p>
<img src="J10 - 3 (3f).PNG"> <p>
<img src="J10 - 3 (3f1).PNG"> <p>
<img src="J10 - 3 (2a).PNG"> <p>
 <img src="J10 - 3 (2b).PNG">
3. Buatlah Implementasi Stack berikut menggunakan Single Linked List <p>
<img src="J10 - 3 (3).PNG"> <p>
<img src="J10 - 3 (3a).PNG"> <p>
<img src="J10 - 3 (3b).PNG"> <p>
<img src="J10 - 3 (3c).PNG"> <p>
<img src="J10 - 3 (3d).PNG"> <p>
<img src="J10 - 3 (3e).PNG"> <p>
<img src="J10 - 3 (3f).PNG"> <p>
<img src="J10 - 3 (3f1).PNG"> <p>
<img src="J10 - 3 (3f2).PNG"> <p>
<img src="J10 - 3 (3g).PNG">
4. Buatlah implementasi program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan KRS pada dosen DPA di kampus pada tugas jobsheet 8 menggunakan LinkedList. Implementasikan Queue pada antrian mahasiswa dengan menggunakan konsep LinkedList!
<img src="J10 - 3 (4a).PNG"> <p>
<img src="J10 - 3 (4b).PNG"> <p>
<img src="J10 - 3 (4c).PNG"> <p>
<img src="J10 - 3 (4d).PNG"> <p>
<img src="J10 - 3 (4e).PNG"> <p>
<img src="J10 - 3 (4f).PNG"> <p>
<img src="J10 - 3 (4g).PNG"> <p>