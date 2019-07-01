package cn.fintecher.pangolin.entity.util;

import cn.fintecher.pangolin.util.SnowflakeIdWorker;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * Created by ChenChang on 2017/3/10.
 */
public class ShortUUID {
    private static String[] chars = new String[]{"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};

    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }

    public static String uuid() {
        return String.valueOf(SnowflakeIdWorker.nextId());
    }

    public static String random(int length) {
        String result="";
        Random random=new Random();
        for(int i=0;i<length;i++){
            result+=random.nextInt(10);
        }
        return result;
    }

    public static void main(String[] args) {
        Map map = new HashMap();
        for (int i =0; i<100000;i++) {
            String uuid = uuid();
            map.put(uuid, uuid);
        }
        System.out.println(map.size());

    }
}