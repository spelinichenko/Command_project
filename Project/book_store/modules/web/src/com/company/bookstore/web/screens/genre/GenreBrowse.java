package com.company.bookstore.web.screens.genre;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.bookstore.entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("bookstore_Genre.browse")
@UiDescriptor("genre-browse.xml")
@LookupComponent("genresTable")
@LoadDataBeforeShow
public class GenreBrowse extends StandardLookup<Genre> {
}