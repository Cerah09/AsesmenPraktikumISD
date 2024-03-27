public class Main {
    public static void main(String[] args) {
        Backstack backstack = new Backstack(5);

        backstack.push("Utama");
        backstack.push("Detail");
        backstack.push("Favorit");
        System.out.println("Anda berada di Halaman Utama");
        backstack.push("Favorit");
        backstack.push("Favorit");

        System.out.println("Maju ke halaman Detail");
        backstack.push("Favorit");
        backstack.push("Favorit");

        System.out.println("Keluar Dari Halaman Favorit");
        backstack.pop();
        backstack.pop();

        System.out.println("Mundur ke Halaman Detail");
        backstack.push("Favorit");
        backstack.push("Favorit");

        System.out.println("Tidak bisa maju ke halaman yang sama");
        backstack.push("Favorit");

        System.out.println("Maju Kehalaman Faforit");
        backstack.push("Favorit");
        backstack.push("Favorit");

        System.out.println("Anda berada di Halaman Utama");
        backstack.pop();
        backstack.pop();
        backstack.pop();

        System.out.println("Mundur ke Halaman Detail");
        backstack.pop();
        backstack.pop();
        backstack.pop();
        backstack.pop();
        backstack.pop();
    }
}