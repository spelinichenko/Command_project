package com.company.bookstore.web.screens.genre;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.screen.*;
import com.company.bookstore.entity.Genre;

@UiController("bookstore_Genre.browse")
@UiDescriptor("genre-browse.xml")
@LookupComponent("genresTable")
@LoadDataBeforeShow
@Route("genres")
public class GenreBrowse extends StandardLookup<Genre> {
}