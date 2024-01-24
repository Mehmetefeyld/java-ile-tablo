/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

// Verileri temsil eden sınıf
class Data {
    String name;
    String surname;

    public Data(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname;
    }
}

// Tabloyu temsil eden sınıf
class Table {
    Data[][] data;

    public Table(int rows, int columns) {
        this.data = new Data[rows][columns];
    }

    public Data getData(int row, int column) {
        return data[row][column];
    }

    public void setData(int row, int column, Data value) {
        data[row][column] = value;
    }
}

// Veritabanını temsil eden sınıf
class Database {
    Table[] tables;

    public Database(int tableCount, int rows, int columns) {
        this.tables = new Table[tableCount];
        for (int i = 0; i < tableCount; i++) {
            tables[i] = new Table(rows, columns);
        }
    }

    public Table getTable(int index) {
        return tables[index];
    }
}

// Ana sınıf (main class)
public class Program {
    public static void main(String[] args) {
        // Veritabanı oluştur
        Database database = new Database(1, 3, 2);

        // Verileri ekle
        database.getTable(0).setData(0, 0, new Data("Ahmet", "XXX"));
        database.getTable(0).setData(0, 1, new Data("Mehmet", "YYY"));
        database.getTable(0).setData(1, 0, new Data("Ayşe", "ZZZ"));

        // Verileri görüntüle
        System.out.println(database.getTable(0).getData(0, 0));
        System.out.println(database.getTable(0).getData(0, 1));
        System.out.println(database.getTable(0).getData(1, 0));
    }
}