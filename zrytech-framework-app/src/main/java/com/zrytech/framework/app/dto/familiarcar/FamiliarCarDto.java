package com.zrytech.framework.app.dto.familiarcar;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 *  车主货主关注关系入参
 */
@Setter
@Getter
public class FamiliarCarDto {
    /**主键*/
    private Integer id;

    /** 关注者Id */
    @NotNull(message = "关注者Id不能为空")
    private Integer cargoOwnnerId;

    /** 被关注者Id */
    @NotNull(message = "被关注者Id不能为空")
    private Integer carOwnnerId;

}
