package model;

/**
 * @create 王宏伟
 * @time 2022-10-17 21:06
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 结果集封装类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code = 200;
    private String msg = "ok";
    private T data;


    public static <T> Result<T> success(T data) {
        Result<T> tResult = new Result<>();
        tResult.setData(data);
        return tResult;
    }

    public static <T> Result<T> success(String msg, T data) {
        Result<T> tResult = new Result<>();
        tResult.setMsg(msg);
        tResult.setData(data);
        return tResult;
    }

    public static <T> Result<T> success(String msg) {
        Result<T> tResult = new Result<>();
        tResult.setMsg(msg);
        return tResult;
    }


    public static <T> Result<T> success(Integer row) {
        Result<T> tResult = new Result<>();
        if (row > 0) {
            tResult.setCode(200);
            tResult.setMsg("操作成功");
        } else {
            tResult.setCode(-1);
            tResult.setMsg("操作失败");
        }
        return tResult;
    }

    public static <T> Result<T> fail(Integer code, String msg) {
        Result<T> tResult = new Result<>();
        tResult.setCode(code);
        tResult.setMsg(msg);
        return tResult;
    }

}
