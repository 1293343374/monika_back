package cn.mymories.monika.mbg.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huyoo
 * @version 1.0
 * @date 2021/12/25 16:30
 * PerformanceVO层,打包给前端
 */
public class PerformanceVO implements Serializable {



    public  class timingTrendingList {
        /**
         * 本次数据汇报的开始日
         *
         */
        private long startTime;
        /**
         * dns加载时间
         *
         */
        private long dns;
        /**
         * tcp连接时间
         *
         */
        private long tcp;
        /**
         * 安全连接时间
         *
         */
        private long ssl;
        /**
         * 首字节耗时
         *
         */
        private long ttfb;

        /**
         * 资源加载
         *
         */
        private long resourceDownload;
        /**
         * dom 解析
         *
         */
        private long domParse;



        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getDns() {
            return dns;
        }

        public void setDns(long dns) {
            this.dns = dns;
        }

        public long getTcp() {
            return tcp;
        }

        public void setTcp(long tcp) {
            this.tcp = tcp;
        }

        public long getSsl() {
            return ssl;
        }

        public void setSsl(long ssl) {
            this.ssl = ssl;
        }

        public long getTtfb() {
            return ttfb;
        }

        public void setTtfb(long ttfb) {
            this.ttfb = ttfb;
        }

        public long getResourceDownload() {
            return resourceDownload;
        }

        public void setResourceDownload(long resourceDownload) {
            this.resourceDownload = resourceDownload;
        }

        public long getDomParse() {
            return domParse;
        }

        public void setDomParse(long domParse) {
            this.domParse = domParse;
        }

    }

}