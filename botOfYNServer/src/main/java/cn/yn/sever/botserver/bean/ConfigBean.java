package cn.yn.sever.botserver.bean;

import lombok.Data;

import java.util.List;

@Data
public class ConfigBean {
    private List<Long> targetQQ;
    private BotConfig botConfig;
}
