<h1>DOKUMENTASI PROJECT POSTTEST 2 PBO</h1>

<P>Nama : Nazwa Talisya Inaya <br>NIM : 2209116063 <br>Kelas : Sistem Informasi B 2022</P>

<h2>A. Screenshot Source Code</h2>

<ol>
  <li>Class Main</li>
  
  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/fa49a9e1-ba8a-48a6-afd0-c26f50ff0f90)
  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/0ba46069-fa48-4e71-85f1-04ea1a9df7ed)
  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/a26b732d-b6fb-4675-87e0-a9f9e1be2c50)
  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/6c6cbc79-309b-4370-8860-b04df42d9c0b)

  <li>Class Restoran</li>
  
  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/792e3f51-3292-41c8-bef0-7eb3440c998f)
  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/b498b615-23c7-4a3c-87fb-7f1dbf027d1d)

</ol>

<h2>B. Penjelasan Source Code</h2>
<ol>
  <li>Class Main</li>
  <ul>
    <li>Deklarasi dan inisialisasi variabel</li>
    <p>Ada sebuah ArrayList bernama menuItem yang berisi objek dari kelas Restoran. Variabel ini akan digunakan untuk menyimpan daftar menu restoran.</p>
    <li>Method addMenuItem</li>
    <p>Fungsi ini memungkinkan pengguna untuk menambahkan item menu baru ke dalam daftar menuItem.</p>
    <li>Method displayMenu</li>
    <p>Fungsi ini mencetak semua item menu yang ada dalam menuItem.</p>
    <li>Method updateMenu</li>
    <p>Fungsi ini memungkinkan pengguna untuk memperbarui nama dan harga menu berdasarkan ID.</p>
    <li>Method deleteMenuItem</li>
    <p>Fungsi ini memungkinkan pengguna untuk menghapus menu berdasarkan ID.</p>
    <li>fungsi Main</li>
    <p>Fungsi ini adalah titik masuk utama untuk menjalankan program. Di dalamnya, pengguna akan diberikan pilihan untuk menambah, menampilkan, memperbarui, atau menghapus menu, serta opsi untuk keluar dari program.</p>
    <li>logika utama</li>
    <p>Program berjalan dalam loop while yang memungkinkan pengguna memilih opsi yang diinginkan melalui input dari keyboard.</p>
    <li>switch statements</li>
    <p>Digunakan untuk menangani pilihan pengguna. Bergantung pada pilihan, program akan melakukan operasi tertentu seperti menambahkan, menampilkan, memperbarui, atau menghapus menu, atau keluar dari program.</p>
    <li>penutupan scanner</li>
    <p>Saat program selesai berjalan, objek Scanner ditutup untuk membebaskan sumber daya.</p>
  </ul>
  <li>Class Restoran</li>
  <p>Restoran adalah kelas yang merepresentasikan item-menu dalam restoran. Kelas ini memiliki tiga atribut: id, name, dan price. id adalah angka unik yang mengidentifikasi setiap menu, name adalah nama menu, dan price adalah harga dari menu tersebut. Kelas ini memiliki konstruktor untuk inisialisasi objek, serta beberapa metode untuk mendapatkan dan mengatur nilai dari atribut-atribut tersebut.</p>
<ol>
  
<h2>C. Penjelasan Output</h2>
  <li>create</li>

  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/d81ef3b6-8af0-4a6b-9d90-93fb6151c79f)
   <ul>
    <li>Pilihan 1 di menu utama memungkinkan pengguna untuk menambahkan menu baru.</li>
    <li>Pengguna diminta untuk memasukkan nama dan harga dari menu baru.</li>
    <li>Setelah menu baru ditambahkan, program memberikan konfirmasi bahwa menu berhasil ditambahkan.</li>
  </ul>

  <li>read</li>

  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/6b12a3c7-46d0-48c3-86bf-6b7ac257ccb6)
   <ul>
    <li>Pilihan 2 di menu utama memungkinkan pengguna untuk menampilkan semua menu yang ada.</li>
    <li>Jika daftar menu tidak kosong, program akan mencetak semua menu beserta ID, nama, dan harga masing-masing.</li>
    <li>Jika daftar menu kosong, program akan memberikan pesan bahwa menu restoran tidak ada.</li>
  </ul>

  <li>update</li>

  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/4b09aa43-f791-4586-b7c0-e9328f5f1083)
  <ul>
    <li>Pilihan 3 di menu utama memungkinkan pengguna untuk memperbarui menu berdasarkan ID.</li>
    <li>Pengguna diminta untuk memasukkan ID menu yang ingin diperbarui, serta nama dan harga baru.</li>
    <li>Jika ID cocok dengan menu yang ada, program akan memperbarui nama dan harga dari menu tersebut.</li>
    <li>Pengguna akan menerima konfirmasi bahwa menu berhasil diperbarui.</li>
  </ul>
 

  <li>delete</li>

  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/f079c5e7-4509-423a-b92a-63d3b9eff0b0)
  <ul>
    <li>Pilihan 4 di menu utama memungkinkan pengguna untuk menghapus menu berdasarkan ID</li>
    <li>Pengguna diminta untuk memasukkan ID menu yang ingin dihapus</li>
    <li>Jika ID cocok dengan menu yang ada, program akan menghapus menu tersebut dari daftar.</li>
    <li>Pengguna akan menerima konfirmasi bahwa menu berhasil dihapus.</li>
  </ul>

  <li>EXIT</li>

  ![image](https://github.com/NazwaTalisya/pbo-post-test-2/assets/127506716/55a1c63f-3935-4f32-8418-6b099ec32f95)
  <p>jika user menginputkan 5 maka program akan selesai</p>

</ol>

<h1>TAMAT</h1>
