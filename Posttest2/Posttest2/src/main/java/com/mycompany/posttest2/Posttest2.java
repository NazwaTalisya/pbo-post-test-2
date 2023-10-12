package com.mycompany.posttest2;
import com.mycompany.Menu.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Posttest2 {
    private static ArrayList<Restoran> menuItem = new ArrayList<>();
    public Posttest2() {
        menuItem = new ArrayList<>();
    }

    // Fungsi untuk menambahkan menu
    public void addMenuItem(Restoran item) {
        menuItem.add(item);
    }

    // Fungsi untuk menampilkan menu
    public void displayMenu() {
        for (Restoran item : menuItem) {
            System.out.println(item);
        }
    }

    // Fungsi untuk mengupdate menu berdasarkan ID
    public void updateMenuItem(int id, String newName, double newPrice) {
        for (Restoran item : menuItem) {
            if (item.getId() == id) {
                item.setName(newName);
                item.setPrice(newPrice);
                System.out.println("Menu berhasil diupdate.");
                return;
            }
        }
        System.out.println("Menu tidak ditemukan.");
    }

    // Fungsi untuk menghapus menu berdasarkan ID
    public void deleteMenuItem(int id) {
        for (Restoran item : menuItem) {
            if (item.getId() == id) {
                menuItem.remove(item);
                System.out.println("Menu berhasil dihapus.");
                return;
            }
        }
        System.out.println("Menu tidak ditemukan.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Posttest2 restaurantMenu = new Posttest2();
        boolean running = true;
        while (running) {
            System.out.println("|=============================|");
            System.out.println("|  Beranda Manjemen Restoran  |");
            System.out.println("|=============================|");
            System.out.println("|1. Tambah Menu               |");
            System.out.println("|2. Tampilkan Menu            |");
            System.out.println("|3. Update Menu               |");
            System.out.println("|4. Hapus Menu                |");
            System.out.println("|0. Keluar                    |");
            System.out.println("|=============================|");
            System.out.print("Silahkan Pilih Menu: ");

            int choice = input.nextInt();
            input.nextLine();  // Membuang karakter newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama menu: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan harga menu: ");
                    double harga = input.nextDouble();
                    restaurantMenu.addMenuItem(new Restoran(restaurantMenu.menuItem.size() + 1, nama, harga));
                    System.out.println("Menu berhasil ditambahkan.");
                    break;
                    
                case 2:
                    if (menuItem.isEmpty()) {
                        System.out.println("Menu Restoran Tidak Ada, Silahkan Tambah Menu.");
                    } else {
                        System.out.println("Daftar HP:");
                        for (Restoran p : menuItem) {
                            System.out.println(p);
                        }
                    }
                    break;
//                    restaurantMenu.displayMenu();
//                    break;
                    
                case 3:
                    System.out.print("Masukkan ID menu yang ingin diupdate: ");
                    int idToUpdate = input.nextInt();
                    input.nextLine();  // Membuang karakter newline
                    System.out.print("Masukkan nama menu baru: ");
                    String newNama = input.nextLine();
                    System.out.print("Masukkan harga menu baru: ");
                    double newHarga = input.nextDouble();
                    restaurantMenu.updateMenuItem(idToUpdate, newNama, newHarga);
                    break;
                    
                case 4:
                    System.out.print("Masukkan ID menu yang ingin dihapus: ");
                    int idToDelete = input.nextInt();
                    restaurantMenu.deleteMenuItem(idToDelete);
                    break;
                    
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        input.close();
    }
}