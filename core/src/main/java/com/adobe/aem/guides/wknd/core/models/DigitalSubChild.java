package com.adobe.aem.guides.wknd.core.models;

import java.util.Date;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalSubChild {
@ValueMapValue
public String writername;

@ValueMapValue
public String writernum;

@ValueMapValue
public Date writerdob;

public String getWritername() {
    return writername;
}


public Date getWriterdob() {
    return writerdob;
}


public String getWriternum() {
    return writernum;
}

}
