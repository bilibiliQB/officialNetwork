package com.dute.officialNetwork.api.response.index;

import com.dute.officialNetwork.domain.entity.OwnerStory;
import io.swagger.annotations.ApiModelProperty;

public class OwnerStoryResponse1 extends BasisArticleDetails{
    @ApiModelProperty("上一篇")
    private OwnerStory prveOwnerStory;

    @ApiModelProperty("下一篇")
    private OwnerStory nextOwnerStory;

    public OwnerStory getPrveOwnerStory() {
        return prveOwnerStory;
    }

    public void setPrveOwnerStory(OwnerStory prveOwnerStory) {
        this.prveOwnerStory = prveOwnerStory;
    }

    public OwnerStory getNextOwnerStory() {
        return nextOwnerStory;
    }

    public void setNextOwnerStory(OwnerStory nextOwnerStory) {
        this.nextOwnerStory = nextOwnerStory;
    }
}
