package org.example.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Pagination {
    public List<PaginatedElements> lists;
    public int currentPage;

    public Pagination() {
        this.lists = new ArrayList<>();
        this.currentPage = 0;
    }
    public void addPaginatedElements(PaginatedElements elementsList){
        lists.add(elementsList);
    }

    public void goToPage(int pageNumber) {
        if (!isEmpty()) {
            if (pageNumber >= 1 && pageNumber <= lists.size()) {
                PaginatedElements displayedList = lists.get(pageNumber - 1);
                displayedList.displayElements();
                currentPage = pageNumber;
            } else {
                System.out.println("Invalid page number.");
            }
        } else {
            System.out.println("Pagination list is empty. Nothing to show");
        }
    }

    public void first() {
        if (!isEmpty()) {
            goToPage(1);
        } else {
            System.out.println("Pagination list is empty. Nothing to show");
        }
    }

    public void last() {
        if (!isEmpty()) {
            goToPage(lists.size());
        } else {
            System.out.println("Pagination list is empty. Nothing to show");
        }
    }

    public void next() {
        if (!isEmpty()) {
            if (currentPage < lists.size()) {
                goToPage(currentPage + 1);
            } else {
                System.out.println("There is no next page.");
            }
        } else {
            System.out.println("The list is empty.");
        }
    }

    public void prev() {
        if (!isEmpty()) {
            if (currentPage > 1) {
                goToPage(currentPage - 1);
            } else {
                System.out.println("You are already on the first page");
            }
        } else {
            System.out.println("The list is empty.");
        }
    }
    public boolean isEmpty(){
        return lists.isEmpty();
    }
}
