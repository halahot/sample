package com.company.sample.web.screens.research;

import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.sample.entity.Research;

import javax.inject.Inject;

@UiController("sample_Research.browse")
@UiDescriptor("research-browse.xml")
@LookupComponent("researchesTable")
@LoadDataBeforeShow
public class ResearchBrowse extends StandardLookup<Research> {
    @Inject
    private GroupTable<Research> researchesTable;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event)
    {
        researchesTable.expandAll();
    }
}