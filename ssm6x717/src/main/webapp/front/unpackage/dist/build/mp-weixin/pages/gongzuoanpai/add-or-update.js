(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/gongzuoanpai/add-or-update"],{"11a8":function(n,a,e){"use strict";var t=e("990a"),r=e.n(t);r.a},6162:function(n,a,e){"use strict";(function(n){e("6bad");t(e("66fd"));var a=t(e("efef"));function t(n){return n&&n.__esModule?n:{default:n}}n(a.default)}).call(this,e("543d")["createPage"])},8711:function(n,a,e){"use strict";(function(n){Object.defineProperty(a,"__esModule",{value:!0}),a.default=void 0;var t=r(e("a34a"));function r(n){return n&&n.__esModule?n:{default:n}}function i(n,a,e,t,r,i,o){try{var u=n[i](o),c=u.value}catch(s){return void e(s)}u.done?a(c):Promise.resolve(c).then(t,r)}function o(n){return function(){var a=this,e=arguments;return new Promise((function(t,r){var o=n.apply(a,e);function u(n){i(o,t,r,u,c,"next",n)}function c(n){i(o,t,r,u,c,"throw",n)}u(void 0)}))}}var u=function(){Promise.all([e.e("common/vendor"),e.e("components/w-picker/w-picker")]).then(function(){return resolve(e("ac7a"))}.bind(null,e)).catch(e.oe)},c={data:function(){return{cross:"",ruleForm:{anpaibianhao:this.getUUID(),biaoti:"",fengmian:"",anpaishijian:"",anpaixiangqing:"",yuangongzhanghao:"",yuangongxingming:""},yuangongzhanghaoOptions:[],yuangongzhanghaoIndex:0,user:{},ro:{anpaibianhao:!1,biaoti:!1,fengmian:!1,anpaishijian:!1,anpaixiangqing:!1,yuangongzhanghao:!1,yuangongxingming:!1}}},components:{wPicker:u},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(a){var e=this;return o(t.default.mark((function r(){var i,o,u,c;return t.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return e.ruleForm.anpaishijian=e.$utils.getCurDateTime(),i=n.getStorageSync("nowTable"),r.next=4,e.$api.session(i);case 4:return o=r.sent,e.user=o.data,r.next=8,e.$api.option("yuangong","yuangongzhanghao",{});case 8:if(o=r.sent,e.yuangongzhanghaoOptions=o.data,e.ruleForm.userid=n.getStorageSync("userid"),a.refid&&(e.ruleForm.refid=a.refid,e.ruleForm.nickname=n.getStorageSync("nickname")),!a.id){r.next=18;break}return e.ruleForm.id=a.id,r.next=16,e.$api.info("gongzuoanpai",e.ruleForm.id);case 16:o=r.sent,e.ruleForm=o.data;case 18:if(e.cross=a.cross,!a.cross){r.next=54;break}u=n.getStorageSync("crossObj"),r.t0=t.default.keys(u);case 22:if((r.t1=r.t0()).done){r.next=54;break}if(c=r.t1.value,"anpaibianhao"!=c){r.next=28;break}return e.ruleForm.anpaibianhao=u[c],e.ro.anpaibianhao=!0,r.abrupt("continue",22);case 28:if("biaoti"!=c){r.next=32;break}return e.ruleForm.biaoti=u[c],e.ro.biaoti=!0,r.abrupt("continue",22);case 32:if("fengmian"!=c){r.next=36;break}return e.ruleForm.fengmian=u[c],e.ro.fengmian=!0,r.abrupt("continue",22);case 36:if("anpaishijian"!=c){r.next=40;break}return e.ruleForm.anpaishijian=u[c],e.ro.anpaishijian=!0,r.abrupt("continue",22);case 40:if("anpaixiangqing"!=c){r.next=44;break}return e.ruleForm.anpaixiangqing=u[c],e.ro.anpaixiangqing=!0,r.abrupt("continue",22);case 44:if("yuangongzhanghao"!=c){r.next=48;break}return e.ruleForm.yuangongzhanghao=u[c],e.ro.yuangongzhanghao=!0,r.abrupt("continue",22);case 48:if("yuangongxingming"!=c){r.next=52;break}return e.ruleForm.yuangongxingming=u[c],e.ro.yuangongxingming=!0,r.abrupt("continue",22);case 52:r.next=22;break;case 54:e.styleChange();case 55:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},yuangongzhanghaoChange:function(n){var a=this;return o(t.default.mark((function e(){var r;return t.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a.yuangongzhanghaoIndex=n.target.value,a.ruleForm.yuangongzhanghao=a.yuangongzhanghaoOptions[a.yuangongzhanghaoIndex],e.next=4,a.$api.follow("yuangong","yuangongzhanghao",{columnValue:a.ruleForm.yuangongzhanghao});case 4:r=e.sent,r.data.yuangongxingming&&(a.ruleForm.yuangongxingming=r.data.yuangongxingming);case 6:case"end":return e.stop()}}),e)})))()},anpaishijianConfirm:function(n){console.log(n),this.ruleForm.anpaishijian=n.result,this.$forceUpdate()},fengmianTap:function(){var n=this;this.$api.upload((function(a){n.ruleForm.fengmian="upload/"+a.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var a=this;return o(t.default.mark((function e(){var r,i,o,u,c,s,g,l,f,d;return t.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!a.cross){e.next=16;break}if(u=n.getStorageSync("statusColumnName"),c=n.getStorageSync("statusColumnValue"),""==u){e.next=16;break}if(s=n.getStorageSync("crossObj"),u.startsWith("[")){e.next=12;break}for(g in s)g==u&&(s[g]=c);return l=n.getStorageSync("crossTable"),e.next=10,a.$api.update("".concat(l),s);case 10:e.next=16;break;case 12:r=Number(n.getStorageSync("userid")),i=s["id"],o=n.getStorageSync("statusColumnName"),o=o.replace(/\[/,"").replace(/\]/,"");case 16:if(!i||!r){e.next=38;break}return a.ruleForm.crossuserid=r,a.ruleForm.crossrefid=i,f={page:1,limit:10,crossuserid:r,crossrefid:i},e.next=22,a.$api.list("gongzuoanpai",f);case 22:if(d=e.sent,!(d.data.total>=o)){e.next=28;break}return a.$utils.msg(n.getStorageSync("tips")),e.abrupt("return",!1);case 28:if(!a.ruleForm.id){e.next=33;break}return e.next=31,a.$api.update("gongzuoanpai",a.ruleForm);case 31:e.next=35;break;case 33:return e.next=35,a.$api.add("gongzuoanpai",a.ruleForm);case 35:a.$utils.msgBack("提交成功");case 36:e.next=46;break;case 38:if(!a.ruleForm.id){e.next=43;break}return e.next=41,a.$api.update("gongzuoanpai",a.ruleForm);case 41:e.next=45;break;case 43:return e.next=45,a.$api.add("gongzuoanpai",a.ruleForm);case 45:a.$utils.msgBack("提交成功");case 46:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var a=new Date,e=a.getFullYear(),t=a.getMonth()+1,r=a.getDate();return"start"===n?e-=60:"end"===n&&(e+=2),t=t>9?t:"0"+t,r=r>9?r:"0"+r,"".concat(e,"-").concat(t,"-").concat(r)},toggleTab:function(n){this.$refs[n].show()}}};a.default=c}).call(this,e("543d")["default"])},"990a":function(n,a,e){},a7da:function(n,a,e){"use strict";e.d(a,"b",(function(){return r})),e.d(a,"c",(function(){return i})),e.d(a,"a",(function(){return t}));var t={wPicker:function(){return Promise.all([e.e("common/vendor"),e.e("components/w-picker/w-picker")]).then(e.bind(null,"ac7a"))}},r=function(){var n=this,a=n.$createElement;n._self._c},i=[]},ca44:function(n,a,e){"use strict";e.r(a);var t=e("8711"),r=e.n(t);for(var i in t)"default"!==i&&function(n){e.d(a,n,(function(){return t[n]}))}(i);a["default"]=r.a},efef:function(n,a,e){"use strict";e.r(a);var t=e("a7da"),r=e("ca44");for(var i in r)"default"!==i&&function(n){e.d(a,n,(function(){return r[n]}))}(i);e("11a8");var o,u=e("f0c5"),c=Object(u["a"])(r["default"],t["b"],t["c"],!1,null,"340aace2",null,!1,t["a"],o);a["default"]=c.exports}},[["6162","common/runtime","common/vendor"]]]);