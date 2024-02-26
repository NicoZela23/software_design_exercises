package org.example.exercise2;

import java.util.Scanner;

public class PaginationManager {
    public static void main(String[] args) {
        Pagination pagination = new Pagination();
        Scanner scanner = new Scanner(System.in);
        String command;
        int pageSize = 0;

        // Welcome message
        System.out.println(" ");
        System.out.println("Welcome to the Java Console Pagination Program!");
        System.out.println("You can manage lists of items with pagination controls.");
        System.out.println("-----------------------------------------------------");

        while (true) {
            // Menu
            System.out.println("Menu:");
            System.out.println("  addFirst<size>      : Create a new page with a specified size");
            System.out.println("  add            : Create a new page with a specified size");
            System.out.println("  first          : Go to the first page");
            System.out.println("  last           : Go to the last page");
            System.out.println("  next           : Go to the next page");
            System.out.println("  prev           : Go to the previous page");
            System.out.println("  goto <page_number> : Go to a specific page");
            System.out.println("  exit           : Exit the program");
            System.out.println(" ");
            // Display current page number
            System.out.println("Current Page: " + pagination.currentPage + " de " + pagination.lists.size());
            System.out.println("-----------------------------------------------------");
            System.out.print(">");

            command = scanner.nextLine();
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "addFirst":
                    // Create a new page with a specified size
                    pageSize = Integer.parseInt(parts[1]); // Assign value to pageSize
                    PaginatedElements firstPage = new PaginatedElements(pageSize);
                    pagination.addPaginatedElements(firstPage);

                    // Add elements to the new page
                    for (int i = 0; i < pageSize; i++) {
                        System.out.println("Enter element to add:");
                        String input = scanner.nextLine();
                        if (input.equals("menu")) {
                            break; // Return to the menu
                        } else {
                            firstPage.addElement(input);
                            // Check if the page array is full
                            if (firstPage.isFull()) {
                                System.out.println("Page is full. Returning to the menu.");
                                System.out.println(" ");
                                break;
                            }
                        }
                    }
                    break;

                case "add":
                    if (pageSize == 0) {
                        System.out.println("Please use 'addFirst' command to specify page size first.");
                        break;
                    }
                    PaginatedElements newPage = new PaginatedElements(pageSize);
                    pagination.addPaginatedElements(newPage);

                    // Add elements to the new page
                    for (int i = 0; i < pageSize; i++) {
                        System.out.println("Enter element to add:");
                        String input = scanner.nextLine();
                        if (input.equals("menu")) {
                            break; // Return to the menu
                        } else {
                            newPage.addElement(input);
                            // Check if the page array is full
                            if (newPage.isFull()) {
                                System.out.println("Page is full. Returning to the menu.");
                                System.out.println(" ");
                                break; // Return to the menu
                            }
                        }
                    }
                    break;

                case "first":
                    // Go to the first page
                    System.out.println(" ");
                    pagination.first();
                    System.out.println(" ");
                    break;
                case "last":
                    // Go to the last page
                    System.out.println(" ");
                    pagination.last();
                    System.out.println(" ");
                    break;
                case "next":
                    // Go to the next page
                    System.out.println(" ");
                    pagination.next();
                    System.out.println(" ");
                    break;
                case "prev":
                    // Go to the previous page
                    System.out.println(" ");
                    pagination.prev();
                    System.out.println(" ");
                    break;
                case "goto":
                    // Go to a specific page
                    System.out.println(" ");
                    pagination.goToPage(Integer.parseInt(parts[1]));
                    System.out.println(" ");
                    break;
                case "exit":
                    // Exit the program
                    System.out.println("Exiting the program...");
                    return; // End the main method and exit the program
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
