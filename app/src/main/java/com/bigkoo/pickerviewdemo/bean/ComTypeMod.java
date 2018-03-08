package com.bigkoo.pickerviewdemo.bean;

import java.util.List;

/**
 * Created by 飞侠 on 2017/8/1.
 */

public class ComTypeMod {

    /**
     * total : 2
     * state : 100
     * msg : 构件类型表数据查询成功！
     * rows : [{"id":"sb","uid":"402881705d5f0622015d5f58b24c000a","text":"上部结构","levCount":1,"children":[{"uid":"402881705d5f0622015d5f5a0e0a0010","id":"sbzl","text":"主梁","levCount":2,"children":[{"uid":"402881ed5d67f680015d68327b64000e","id":"sbzl22","text":"L梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"},{"uid":"402881705d5f0622015d5f5a6ebf0011","id":"sbzldl","text":"大梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"},{"uid":"402881705d5f0622015d5f5aaa6d0012","id":"sbzlTl22","text":"T梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"}],"compCategory":"1","parentCode":"sb","type":"1","structureType":"","parent_code":"sb"},{"uid":"402881705d7dd61b015d7dda04c10001","id":"sbzz","text":"支座","levCount":2,"children":[{"uid":"402881705d7dd61b015d7dda37d50002","id":"sbzzpszz","text":"盆式支座","levCount":3,"children":[],"compCategory":"2","parentCode":"sbzz","type":"2","structureType":"lsq","parent_code":"sbzz"},{"uid":"402881705d7dd61b015d7dda651e0003","id":"sbzzxjzz","text":"橡胶支座","levCount":3,"children":[],"compCategory":"2","parentCode":"sbzz","type":"2","structureType":"gsq","parent_code":"sbzz"}],"compCategory":"2","parentCode":"sb","type":"1","structureType":"","parent_code":"sb"}],"type":"1","parentCode":"","parent_code":""},{"id":"xb","uid":"402881705d5f0622015d5f58b258000b","text":"下部结构","levCount":1,"children":[{"uid":"4028818a5d62f1e5015d63046e900003","id":"xbqd","text":"桥墩","levCount":2,"children":[{"uid":"402881705d7cf7b1015d7d9c86590013","id":"xbqdkxsqd","text":"空心式桥墩","levCount":3,"children":[],"compCategory":"5","parentCode":"xbqd","type":"2","structureType":"gsq","parent_code":"xbqd"},{"uid":"402881705d7cf7b1015d7d9bfe870012","id":"xbqdstsqd","text":"实体式桥墩","levCount":3,"children":[],"compCategory":"5","parentCode":"xbqd","type":"2","structureType":"lsq","parent_code":"xbqd"},{"uid":"402881705d7cf7b1015d7d9e147b0019","id":"xbqdzhzsqd","text":"桩或柱式桥墩","levCount":3,"children":[],"compCategory":"5","parentCode":"xbqd","type":"2","structureType":"xlq","parent_code":"xbqd"}],"compCategory":"5","parentCode":"xb","type":"1","structureType":"","parent_code":"xb"}],"type":"1","parentCode":"","parent_code":""}]
     */

    private int total;
    private int state;
    private String msg;
    private List<RowsBean> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        /**
         * id : sb
         * uid : 402881705d5f0622015d5f58b24c000a
         * text : 上部结构
         * levCount : 1
         * children : [{"uid":"402881705d5f0622015d5f5a0e0a0010","id":"sbzl","text":"主梁","levCount":2,"children":[{"uid":"402881ed5d67f680015d68327b64000e","id":"sbzl22","text":"L梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"},{"uid":"402881705d5f0622015d5f5a6ebf0011","id":"sbzldl","text":"大梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"},{"uid":"402881705d5f0622015d5f5aaa6d0012","id":"sbzlTl22","text":"T梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"}],"compCategory":"1","parentCode":"sb","type":"1","structureType":"","parent_code":"sb"},{"uid":"402881705d7dd61b015d7dda04c10001","id":"sbzz","text":"支座","levCount":2,"children":[{"uid":"402881705d7dd61b015d7dda37d50002","id":"sbzzpszz","text":"盆式支座","levCount":3,"children":[],"compCategory":"2","parentCode":"sbzz","type":"2","structureType":"lsq","parent_code":"sbzz"},{"uid":"402881705d7dd61b015d7dda651e0003","id":"sbzzxjzz","text":"橡胶支座","levCount":3,"children":[],"compCategory":"2","parentCode":"sbzz","type":"2","structureType":"gsq","parent_code":"sbzz"}],"compCategory":"2","parentCode":"sb","type":"1","structureType":"","parent_code":"sb"}]
         * type : 1
         * parentCode :
         * parent_code :
         */

        private String id;
        private String uid;
        private String text;
        private int levCount;
        private String type;
        private String parentCode;
        private String parent_code;
        private List<ChildrenBeanX> children;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getLevCount() {
            return levCount;
        }

        public void setLevCount(int levCount) {
            this.levCount = levCount;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getParentCode() {
            return parentCode;
        }

        public void setParentCode(String parentCode) {
            this.parentCode = parentCode;
        }

        public String getParent_code() {
            return parent_code;
        }

        public void setParent_code(String parent_code) {
            this.parent_code = parent_code;
        }

        public List<ChildrenBeanX> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBeanX> children) {
            this.children = children;
        }

        public static class ChildrenBeanX {
            /**
             * uid : 402881705d5f0622015d5f5a0e0a0010
             * id : sbzl
             * text : 主梁
             * levCount : 2
             * children : [{"uid":"402881ed5d67f680015d68327b64000e","id":"sbzl22","text":"L梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"},{"uid":"402881705d5f0622015d5f5a6ebf0011","id":"sbzldl","text":"大梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"},{"uid":"402881705d5f0622015d5f5aaa6d0012","id":"sbzlTl22","text":"T梁","levCount":3,"children":[],"compCategory":"1","parentCode":"sbzl","type":"2","structureType":"lsq","parent_code":"sbzl"}]
             * compCategory : 1
             * parentCode : sb
             * type : 1
             * structureType :
             * parent_code : sb
             */

            private String uid;
            private String id;
            private String text;
            private int levCount;
            private String compCategory;
            private String parentCode;
            private String type;
            private String structureType;
            private String parent_code;
            private List<ChildrenBean> children;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getLevCount() {
                return levCount;
            }

            public void setLevCount(int levCount) {
                this.levCount = levCount;
            }

            public String getCompCategory() {
                return compCategory;
            }

            public void setCompCategory(String compCategory) {
                this.compCategory = compCategory;
            }

            public String getParentCode() {
                return parentCode;
            }

            public void setParentCode(String parentCode) {
                this.parentCode = parentCode;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStructureType() {
                return structureType;
            }

            public void setStructureType(String structureType) {
                this.structureType = structureType;
            }

            public String getParent_code() {
                return parent_code;
            }

            public void setParent_code(String parent_code) {
                this.parent_code = parent_code;
            }

            public List<ChildrenBean> getChildren() {
                return children;
            }

            public void setChildren(List<ChildrenBean> children) {
                this.children = children;
            }

            public static class ChildrenBean {
                /**
                 * uid : 402881ed5d67f680015d68327b64000e
                 * id : sbzl22
                 * text : L梁
                 * levCount : 3
                 * children : []
                 * compCategory : 1
                 * parentCode : sbzl
                 * type : 2
                 * structureType : lsq
                 * parent_code : sbzl
                 */

                private String uid;
                private String id;
                private String text;
                private int levCount;
                private String compCategory;
                private String parentCode;
                private String type;
                private String structureType;
                private String parent_code;
                private List<?> children;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getLevCount() {
                    return levCount;
                }

                public void setLevCount(int levCount) {
                    this.levCount = levCount;
                }

                public String getCompCategory() {
                    return compCategory;
                }

                public void setCompCategory(String compCategory) {
                    this.compCategory = compCategory;
                }

                public String getParentCode() {
                    return parentCode;
                }

                public void setParentCode(String parentCode) {
                    this.parentCode = parentCode;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getStructureType() {
                    return structureType;
                }

                public void setStructureType(String structureType) {
                    this.structureType = structureType;
                }

                public String getParent_code() {
                    return parent_code;
                }

                public void setParent_code(String parent_code) {
                    this.parent_code = parent_code;
                }

                public List<?> getChildren() {
                    return children;
                }

                public void setChildren(List<?> children) {
                    this.children = children;
                }
            }
        }
    }
}
