 static void deleteStudent() {
        System.out.print("Enter USN to delete: ");
        String usn = sc.nextLine();
        boolean deleted = false;

        for (int i = 0; i < count; i++) {
            if (students[i].usn.equalsIgnoreCase(usn)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                System.out.println("✔ Student deleted successfully.");
                deleted = true;
                break;
            }
        }

        if (!deleted) {
            System.out.println("❌ Student not found.");
        }
    }
}
