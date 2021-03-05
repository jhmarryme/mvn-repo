package com.jhmarryme.demo.pojo.vo;

import com.jhmarryme.demo.common.base.BasisGroups;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 *
 * @author JiaHao Wang
 * @date 2021/3/5 11:49
 */
@Data
public class TestVO {

    @NotEmpty(message = "{demo.name.null}")
    @NotNull(groups = {BasisGroups.UpdateGroup.class})
    private String name;

    @Length(min = 5, max = 25, message = "{demo.key.length}", groups = {BasisGroups.UpdateGroup.class})
    private String key;

    @Pattern(regexp = "[012]", message = "无效的状态标志", groups = {BasisGroups.InsertGroup.class})
    private String state;
}
