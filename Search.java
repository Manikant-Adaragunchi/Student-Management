static void searchStudent() {
        System.out.print("Enter USN to search: ");
        String usn = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (students[i].usn.equalsIgnoreCase(usn)) {
                System.out.println("✔ Student found:");
                students[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Student with USN " + usn + " not found.");
        }
}
