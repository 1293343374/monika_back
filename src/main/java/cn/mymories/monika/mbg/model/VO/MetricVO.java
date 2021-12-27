package cn.mymories.monika.mbg.model.VO;

import java.io.Serializable;

public class Metric implements Serializable {

    /**
     * 首次有效绘制时间
     */
    private Long fmp;
    /**
     * 完全可交互时间
     */
    private Long tti;

    /**
     * 首次渲染的时间
     */
    private Long fp;

    /**
     * 首次有内容渲染的时间
     */
    private Long fcp;

    /**
     * 用户与页面首次交互所需时间
     */
    private Long fid;

    /**
     * 用户与页面首次交互可能花费最长时间
     */
    private Long mpfid;

    /**
     * 页面布局变化的累计偏移指标
     */
    private Long cls;

    public Long getFmp() {
        return fmp;
    }

    public void setFmp(Long fmp) {
        this.fmp = fmp;
    }

    public Long getTti() {
        return tti;
    }

    public void setTti(Long tti) {
        this.tti = tti;
    }

    public Long getFp() {
        return fp;
    }

    public void setFp(Long fp) {
        this.fp = fp;
    }

    public Long getFcp() {
        return fcp;
    }

    public void setFcp(Long fcp) {
        this.fcp = fcp;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getMpfid() {
        return mpfid;
    }

    public void setMpfid(Long mpfid) {
        this.mpfid = mpfid;
    }

    public Long getCls() {
        return cls;
    }

    public void setCls(Long cls) {
        this.cls = cls;
    }
}
