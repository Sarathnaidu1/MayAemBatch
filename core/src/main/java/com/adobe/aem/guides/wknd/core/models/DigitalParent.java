package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalParent {
 
    @ValueMapValue
    public String text;
    
    @ValueMapValue
    public String desc;

    @ScriptVariable
    Page currentPage;

   @Inject
   ResourceResolver resolver;



    public String getArticleTitle()
    {
        return currentPage.getTitle();
    }
   public String getPagePath()
   {
    return currentPage.getPath();
   }
   public Page getPageParent()
   {
    return currentPage.getParent();
   }

    public String getWebContentNode()
    {
        return resolver.getUserID();
    }
   
    @ChildResource
    public List<DigitalChild> bookdetailswithmap;

    public String getText() {
        return text;
    }

    public String getDesc() {
        return desc;
    }

    public List<DigitalChild> getBookdetailswithmap() {
        return bookdetailswithmap;
    }

}
