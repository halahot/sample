package com.company.sample.web.screens.research;

import com.haulmont.cuba.gui.screen.*;
import com.company.sample.entity.Research;

@UiController("sample_Research.edit")
@UiDescriptor("research-edit.xml")
@EditedEntityContainer("researchDc")
@LoadDataBeforeShow
public class ResearchEdit extends StandardEditor<Research> {
}