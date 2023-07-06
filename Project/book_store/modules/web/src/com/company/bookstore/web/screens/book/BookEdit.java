package com.company.bookstore.web.screens.book;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.company.bookstore.entity.Book;

import javax.inject.Inject;

@UiController("bookstore_Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
@LoadDataBeforeShow
public class BookEdit extends StandardEditor<Book> {
    @Inject
    private TextField<Integer> countField;

    @Subscribe("slider")
    private void onSliderValueChange(HasValue.ValueChangeEvent<Integer> event) {
        countField.setValue(event.getValue());
    }
}