package com.company.bookstore.web.screens.book;

import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.company.bookstore.entity.Book;

import javax.inject.Inject;

@UiController("bookstore_Book.browse")
@UiDescriptor("book-browse.xml")
@LookupComponent("booksTable")
@LoadDataBeforeShow
public class BookBrowse extends StandardLookup<Book> {

    @Inject
    private Screens screens;

    @Subscribe("openNewWindowForDiagram")
    public void onOpenNewWindowForDiagramClick(Button.ClickEvent event) {
        NewScreen newScreen = screens.create(NewScreen.class, OpenMode.DIALOG);
        newScreen.show();
    }
    
}