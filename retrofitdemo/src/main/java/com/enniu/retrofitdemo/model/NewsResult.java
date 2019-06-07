package com.enniu.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Author: 王立
 * @Date: 2019/4/28 20:19
 * @Desc:
 */
public class NewsResult {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"f5e4622878a4dbc97fcb9eb4c315cf44","title":"咸阳秦都国土资源分局延伸监督链条促进扫黑除恶专项斗争","date":"2019-05-05 18:59","category":"头条","author_name":"西部法制报","url":"http://mini.eastday.com/mobile/190505185923933.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190505/20190505185923_b87a36d630c7713e9350a3f87424bb9b_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190505/20190505185923_b87a36d630c7713e9350a3f87424bb9b_2_mwpm_03200403.jpg"},{"uniquekey":"2a5341a22cdc17ef1ab18ee58ba22cef","title":"修一大误区：卧室铺地板，客厅铺瓷砖！","date":"2019-05-05 18:55","category":"头条","author_name":"解说装修那些事","url":"http://mini.eastday.com/mobile/190505185555488.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505185555_e373c51eb31f9e23e44fc72bd8655148_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/20190505185555_e373c51eb31f9e23e44fc72bd8655148_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/20190505185555_e373c51eb31f9e23e44fc72bd8655148_5_mwpm_03200403.jpg"},{"uniquekey":"61787674178d1f52e188b0958e106101","title":"不愧是不怕死的小强，上市9天仅卖311台，竟然还敢加价提车","date":"2019-05-05 18:53","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/190505185304182.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505185304_d6aa19af61e310444ee495a73cf706f6_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505185304_d6aa19af61e310444ee495a73cf706f6_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505185304_d6aa19af61e310444ee495a73cf706f6_6_mwpm_03200403.jpg"},{"uniquekey":"2bcbd9274b99482abdf8084cae5708c2","title":"如果费德勒是\u201c美国队长\u201d费德勒，那么钢铁侠和雷神会是谁呢？","date":"2019-05-05 18:52","category":"头条","author_name":"新闻晨报体育","url":"http://mini.eastday.com/mobile/190505185252779.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505185252_465e24ae54ba99de431c963d4a3b22a7_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/20190505185252_465e24ae54ba99de431c963d4a3b22a7_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/20190505185252_465e24ae54ba99de431c963d4a3b22a7_3_mwpm_03200403.jpg"},{"uniquekey":"c2a8d3dcdc8e82c839bdf8ce49e7b7d4","title":"章子怡对韩雪说\u201c悄悄话\u201d忘关麦，不料话语流出，观众笑而不语","date":"2019-05-05 18:46","category":"头条","author_name":"娱乐涛声","url":"http://mini.eastday.com/mobile/190505184643262.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505184643_96bff6d9aa995dcb60d045736b0f3d76_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505184643_96bff6d9aa995dcb60d045736b0f3d76_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505184643_96bff6d9aa995dcb60d045736b0f3d76_1_mwpm_03200403.jpg"},{"uniquekey":"7bd2bac299a28286d7e3060b13f988bb","title":"意甲最后的金字招牌：他与巴萨的故事，猜中了开头却没猜到结尾","date":"2019-05-05 18:45","category":"头条","author_name":"球后","url":"http://mini.eastday.com/mobile/190505184557189.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190505/2019050518_d41e082b9a6f4132a836fd997f966bbc_5857_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190505/2019050518_fc788654e1da44128c3d89a288092798_6868_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190505/2019050518_b099ec950a1b4e97aba0723603a3eee0_4782_mwpm_03200403.jpg"},{"uniquekey":"248df83f57ed0d2f1ebb30d7a1a6f6aa","title":"男子表演蟒蛇绕颈惨被勒死 观众还以为是表演","date":"2019-05-05 18:41","category":"头条","author_name":"观察者网","url":"http://mini.eastday.com/mobile/190505184156184.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505184156_7ec43ee5280c630bafa605fe44d2c93f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505184156_7ec43ee5280c630bafa605fe44d2c93f_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505184156_7ec43ee5280c630bafa605fe44d2c93f_1_mwpm_03200403.jpg"},{"uniquekey":"a86e91cb90bf7a4ed874120f77afc450","title":"此人由诸葛亮杀死，他不死或改变三国的历史，这人是谁","date":"2019-05-05 18:34","category":"头条","author_name":"历史有点意思","url":"http://mini.eastday.com/mobile/190505183441877.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505183441_8ea2b2c6b1f27f23f9ee8d10ffa86afc_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505183441_8ea2b2c6b1f27f23f9ee8d10ffa86afc_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505183441_8ea2b2c6b1f27f23f9ee8d10ffa86afc_1_mwpm_03200403.jpg"},{"uniquekey":"5d3f763fe01954d831193fba770a9eb6","title":"申城整治店招，为何一出手就容易千篇一律？来听听城管部门怎么说","date":"2019-05-05 18:33","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/190505183349498.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505183349_0645c7cb9e396c2734ee5b6b0e3f6e3b_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505183349_0645c7cb9e396c2734ee5b6b0e3f6e3b_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505183349_0645c7cb9e396c2734ee5b6b0e3f6e3b_2_mwpm_03200403.jpg"},{"uniquekey":"e7f13469ac7f852daf647bc67bfd31fc","title":"广东宏远夺冠庆功宴有亮点！总经理朱芳雨内线引援目标曝光","date":"2019-05-05 18:32","category":"头条","author_name":"璞玉话体坛","url":"http://mini.eastday.com/mobile/190505183248056.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/2019050518_f1c59b8e89ed4144ac01277bf78f4cf4_2167_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/2019050518_6c87c97c323f458e8ad1a4a3c28d774e_7659_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/2019050518_dae79f3490374ff0880f87edfe44db54_0928_cover_mwpm_03200403.jpg"},{"uniquekey":"b80566da3c3e10bd85138225c566d66f","title":"婚后过得最累的三大星座，忙碌不停，天生操心命！","date":"2019-05-05 18:32","category":"头条","author_name":"小熊时尚穿搭","url":"http://mini.eastday.com/mobile/190505183232013.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190505/2019050518_cbe647eb3b4746ec9b649fd607d56cb5_1460_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190505/2019050518_5fba8500f5b742188b69dada3773072f_9545_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190505/2019050518_171fe782f00948f0a07e16d2bcf70bd1_4152_mwpm_03200403.jpg"},{"uniquekey":"18bc0981ee1901da8778ab833d8828ea","title":"携手《中国好声音》总冠军梁博团队 陌陌王海鹭将推最新单曲","date":"2019-05-05 18:32","category":"头条","author_name":"华声在线","url":"http://mini.eastday.com/mobile/190505183211706.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190505/20190505183211_135e2b54c4d007c148701c656e9bf81a_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190505/20190505183211_135e2b54c4d007c148701c656e9bf81a_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190505/20190505183211_135e2b54c4d007c148701c656e9bf81a_3_mwpm_03200403.jpg"},{"uniquekey":"dfa873feb6dde5066f4841da479458dc","title":"证监会并购重组委20人拟任名单公示：11人来自证监系统","date":"2019-05-05 18:31","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/190505183152309.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505183152_6219abf6d56c406065e0a9f0c015e5f2_1_mwpm_03200403.jpg"},{"uniquekey":"db9cb1d3dd9fc41b5f370efaa8da4e96","title":"宁夏6项\u201c狠招\u201d治理普通高中自主招生\u201c乱象\u201d","date":"2019-05-05 18:31","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190505183138867.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190505/20190505183138_5d55156a96cc165a786f5d23df0cdac0_1_mwpm_03200403.jpg"},{"uniquekey":"82198a16da658409447d10d66f967f40","title":"原创 开心一刻：李姐找了个比她爸还要大的男友，这天她带着男友回家","date":"2019-05-05 18:31","category":"头条","author_name":"君叔笑话","url":"http://mini.eastday.com/mobile/190505183138051.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505183138_e1076aa1e610326dd2f1e9812bc172b5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505183138_e1076aa1e610326dd2f1e9812bc172b5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505183138_e1076aa1e610326dd2f1e9812bc172b5_3_mwpm_03200403.jpg"},{"uniquekey":"d37c6e9327f673e66603f29f1c6b7e7b","title":"看完章子怡素颜，男人都怀疑人生，看汪峰素颜，女人都说糟老头子","date":"2019-05-05 18:29","category":"头条","author_name":"冷雨夜","url":"http://mini.eastday.com/mobile/190505182949650.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505182949_4c7e2313f4cef410f87913e929a0366e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505182949_4c7e2313f4cef410f87913e929a0366e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505182949_4c7e2313f4cef410f87913e929a0366e_4_mwpm_03200403.jpg"},{"uniquekey":"4930c9828f8a0d513f7b5b834a0c5836","title":"月底，斗转星移，岁月如梭，心心相印到白头，复合在即的星座","date":"2019-05-05 18:25","category":"头条","author_name":"星星的低语","url":"http://mini.eastday.com/mobile/190505182550327.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505182550_a37e6bba2486fe568b34e8cd475f938f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505182550_a37e6bba2486fe568b34e8cd475f938f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505182550_a37e6bba2486fe568b34e8cd475f938f_1_mwpm_03200403.jpg"},{"uniquekey":"267b022d337c0b547e1aeb43229c38de","title":"不择手段！美国强势关闭伊朗地区GPS系统，俄罗斯将出手支援","date":"2019-05-05 18:25","category":"头条","author_name":"东方头条 芊微防务观察","url":"http://mini.eastday.com/mobile/190505182503641.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190505/2019050518_411c719a6b8e4355a12753c8557e9e82_0025_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190505/2019050518_12603d1bca1b477ca7dde31eaf242c84_4657_mwpm_03200403.jpg"},{"uniquekey":"3c3db0eefb71eaf34a4f79bf8710ecbd","title":"信阳市扫黑除恶专项斗争第八次推进会，孙同占强调这些事","date":"2019-05-05 18:24","category":"头条","author_name":"中原盾","url":"http://mini.eastday.com/mobile/190505182424711.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505182424_5a97559e3eee044d0474ace7f61cc8a7_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/20190505182424_5a97559e3eee044d0474ace7f61cc8a7_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/20190505182424_5a97559e3eee044d0474ace7f61cc8a7_3_mwpm_03200403.jpg"},{"uniquekey":"25fbc8151c31594f05ff4e9bb24076c4","title":"曾是好莱坞票房保障，力捧儿子17年，没想到自己却过气了","date":"2019-05-05 18:24","category":"头条","author_name":"尚之潮","url":"http://mini.eastday.com/mobile/190505182405899.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190505/20190505182405_3c4d48044d841694f603f91b0336eacd_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190505/20190505182405_3c4d48044d841694f603f91b0336eacd_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190505/20190505182405_3c4d48044d841694f603f91b0336eacd_2_mwpm_03200403.jpg"},{"uniquekey":"a0ba9883e3a82b1e447d766602fdd6ba","title":"面粉别再只做白馒头了，做的时候里面加点红豆，小朋友们都爱吃","date":"2019-05-05 18:23","category":"头条","author_name":"美食圈","url":"http://mini.eastday.com/mobile/190505182356715.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505182356_23a1de05b2940183852bb3be1c72efff_9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505182356_23a1de05b2940183852bb3be1c72efff_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505182356_23a1de05b2940183852bb3be1c72efff_7_mwpm_03200403.jpg"},{"uniquekey":"cf5400ce78c0e8f73d0961a8d74be573","title":"1个月内，4位院士先后抵达，只为西北大学而来！","date":"2019-05-05 18:23","category":"头条","author_name":"西北大学招生办","url":"http://mini.eastday.com/mobile/190505182339254.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505182339_4b331a0260a965ddcb45515c75445851_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505182339_4b331a0260a965ddcb45515c75445851_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505182339_4b331a0260a965ddcb45515c75445851_3_mwpm_03200403.jpg"},{"uniquekey":"00b8331c52cbb43cbbc22117d81a00bc","title":"欧冠次回合逆转3球有多难？改制后仅3次，利物浦希望尚存！","date":"2019-05-05 18:22","category":"头条","author_name":"掌上球事APP","url":"http://mini.eastday.com/mobile/190505182254533.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505182254_bd41a2e284d7cb6780e14e6883db89a4_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505182254_bd41a2e284d7cb6780e14e6883db89a4_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505182254_bd41a2e284d7cb6780e14e6883db89a4_2_mwpm_03200403.jpg"},{"uniquekey":"8d5b6a84d20fa4ef130b9fbc44698e3d","title":"昔日的奥运冠军 曾经的女排国手 刘亚男中国女排的\u201c第一女神\u201d","date":"2019-05-05 18:22","category":"头条","author_name":"小帆谈娱乐","url":"http://mini.eastday.com/mobile/190505182252797.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505182252_c9430534e4c05203eab301e70429638a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505182252_c9430534e4c05203eab301e70429638a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505182252_c9430534e4c05203eab301e70429638a_4_mwpm_03200403.jpg"},{"uniquekey":"2e22ad5039592881fe15ccddbac621e9","title":"平安产险河南分公司 \u201c安全出行，信任护航\u201d五一护航活动圆满收官","date":"2019-05-05 18:22","category":"头条","author_name":"映象网","url":"http://mini.eastday.com/mobile/190505182241150.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505182241_cc1dc2d931b656d27460bb4830930bfb_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505182241_cc1dc2d931b656d27460bb4830930bfb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505182241_cc1dc2d931b656d27460bb4830930bfb_5_mwpm_03200403.jpg"},{"uniquekey":"372a5e378c47d6b03bc12dc39465923b","title":"小米荣耀劲敌上线！realme X即将解除封印，概念海报引起热议","date":"2019-05-05 18:19","category":"头条","author_name":"科技face","url":"http://mini.eastday.com/mobile/190505181922858.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190505/20190505181922_7ed42f0e4131d7fc8945584c5ce03a40_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190505/20190505181922_7ed42f0e4131d7fc8945584c5ce03a40_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190505/20190505181922_7ed42f0e4131d7fc8945584c5ce03a40_3_mwpm_03200403.jpg"},{"uniquekey":"0cd90de076142a3728d64e0d662d564b","title":"街拍女神：时下最流行的紧身裤，展现美女的极致身材","date":"2019-05-05 18:19","category":"头条","author_name":"美肤小霸王","url":"http://mini.eastday.com/mobile/190505181916342.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190505/2019050518_ac6c99fc9001444fa09fcc3c24ced33d_0148_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190505/2019050518_e1b39d9af45841bba5c76591b05d32fc_2711_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190505/2019050518_b107dfe7a61a48eda8044198fde4d35f_6042_cover_mwpm_03200403.jpg"},{"uniquekey":"00f9ca9857df9c5a859427d2066a8f6f","title":"她是最没骨气的梁山女神，不仅给敌人暖床，还为敌人征战而死","date":"2019-05-05 18:17","category":"头条","author_name":"快乐的猫","url":"http://mini.eastday.com/mobile/190505181701994.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/2019050518_96a2a9d9d29d49b98d06146bef0fc595_1623_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/2019050518_9e6a384bcc144889b7cffaa7604afeaf_3664_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/2019050518_b946eb78e0a24f80bcf90d1e36146847_3936_mwpm_03200403.jpg"},{"uniquekey":"2f40c46a5c907e2efdd24bd32c2facd8","title":"笑里藏刀？特朗普突然宣布重大决定，\u201c邀请\u201d中国，中方明确拒绝","date":"2019-05-05 18:16","category":"头条","author_name":"经典军事","url":"http://mini.eastday.com/mobile/190505181632769.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505181632_b4df580ef449fc9e4fed700eb5c43849_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505181632_b4df580ef449fc9e4fed700eb5c43849_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505181632_b4df580ef449fc9e4fed700eb5c43849_3_mwpm_03200403.jpg"},{"uniquekey":"b6883b68dc2808e2d43093f3efb6088b","title":"优速快递董事长夫妻双双身亡 生前疑曾发生争执","date":"2019-05-05 18:16","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/190505181623670.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505182139_9b819575f6834464c23285007fcac570_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505182139_9b819575f6834464c23285007fcac570_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505182139_9b819575f6834464c23285007fcac570_3_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    @SerializedName ("reason")
    private String reason;
    @SerializedName ("result")
    private ResultBean result;
    @SerializedName ("error_code")
    private int errorCode;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"f5e4622878a4dbc97fcb9eb4c315cf44","title":"咸阳秦都国土资源分局延伸监督链条促进扫黑除恶专项斗争","date":"2019-05-05 18:59","category":"头条","author_name":"西部法制报","url":"http://mini.eastday.com/mobile/190505185923933.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190505/20190505185923_b87a36d630c7713e9350a3f87424bb9b_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190505/20190505185923_b87a36d630c7713e9350a3f87424bb9b_2_mwpm_03200403.jpg"},{"uniquekey":"2a5341a22cdc17ef1ab18ee58ba22cef","title":"修一大误区：卧室铺地板，客厅铺瓷砖！","date":"2019-05-05 18:55","category":"头条","author_name":"解说装修那些事","url":"http://mini.eastday.com/mobile/190505185555488.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505185555_e373c51eb31f9e23e44fc72bd8655148_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/20190505185555_e373c51eb31f9e23e44fc72bd8655148_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/20190505185555_e373c51eb31f9e23e44fc72bd8655148_5_mwpm_03200403.jpg"},{"uniquekey":"61787674178d1f52e188b0958e106101","title":"不愧是不怕死的小强，上市9天仅卖311台，竟然还敢加价提车","date":"2019-05-05 18:53","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/190505185304182.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505185304_d6aa19af61e310444ee495a73cf706f6_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505185304_d6aa19af61e310444ee495a73cf706f6_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505185304_d6aa19af61e310444ee495a73cf706f6_6_mwpm_03200403.jpg"},{"uniquekey":"2bcbd9274b99482abdf8084cae5708c2","title":"如果费德勒是\u201c美国队长\u201d费德勒，那么钢铁侠和雷神会是谁呢？","date":"2019-05-05 18:52","category":"头条","author_name":"新闻晨报体育","url":"http://mini.eastday.com/mobile/190505185252779.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505185252_465e24ae54ba99de431c963d4a3b22a7_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/20190505185252_465e24ae54ba99de431c963d4a3b22a7_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/20190505185252_465e24ae54ba99de431c963d4a3b22a7_3_mwpm_03200403.jpg"},{"uniquekey":"c2a8d3dcdc8e82c839bdf8ce49e7b7d4","title":"章子怡对韩雪说\u201c悄悄话\u201d忘关麦，不料话语流出，观众笑而不语","date":"2019-05-05 18:46","category":"头条","author_name":"娱乐涛声","url":"http://mini.eastday.com/mobile/190505184643262.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505184643_96bff6d9aa995dcb60d045736b0f3d76_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505184643_96bff6d9aa995dcb60d045736b0f3d76_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505184643_96bff6d9aa995dcb60d045736b0f3d76_1_mwpm_03200403.jpg"},{"uniquekey":"7bd2bac299a28286d7e3060b13f988bb","title":"意甲最后的金字招牌：他与巴萨的故事，猜中了开头却没猜到结尾","date":"2019-05-05 18:45","category":"头条","author_name":"球后","url":"http://mini.eastday.com/mobile/190505184557189.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190505/2019050518_d41e082b9a6f4132a836fd997f966bbc_5857_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190505/2019050518_fc788654e1da44128c3d89a288092798_6868_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190505/2019050518_b099ec950a1b4e97aba0723603a3eee0_4782_mwpm_03200403.jpg"},{"uniquekey":"248df83f57ed0d2f1ebb30d7a1a6f6aa","title":"男子表演蟒蛇绕颈惨被勒死 观众还以为是表演","date":"2019-05-05 18:41","category":"头条","author_name":"观察者网","url":"http://mini.eastday.com/mobile/190505184156184.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505184156_7ec43ee5280c630bafa605fe44d2c93f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505184156_7ec43ee5280c630bafa605fe44d2c93f_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505184156_7ec43ee5280c630bafa605fe44d2c93f_1_mwpm_03200403.jpg"},{"uniquekey":"a86e91cb90bf7a4ed874120f77afc450","title":"此人由诸葛亮杀死，他不死或改变三国的历史，这人是谁","date":"2019-05-05 18:34","category":"头条","author_name":"历史有点意思","url":"http://mini.eastday.com/mobile/190505183441877.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505183441_8ea2b2c6b1f27f23f9ee8d10ffa86afc_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505183441_8ea2b2c6b1f27f23f9ee8d10ffa86afc_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505183441_8ea2b2c6b1f27f23f9ee8d10ffa86afc_1_mwpm_03200403.jpg"},{"uniquekey":"5d3f763fe01954d831193fba770a9eb6","title":"申城整治店招，为何一出手就容易千篇一律？来听听城管部门怎么说","date":"2019-05-05 18:33","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/190505183349498.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505183349_0645c7cb9e396c2734ee5b6b0e3f6e3b_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505183349_0645c7cb9e396c2734ee5b6b0e3f6e3b_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505183349_0645c7cb9e396c2734ee5b6b0e3f6e3b_2_mwpm_03200403.jpg"},{"uniquekey":"e7f13469ac7f852daf647bc67bfd31fc","title":"广东宏远夺冠庆功宴有亮点！总经理朱芳雨内线引援目标曝光","date":"2019-05-05 18:32","category":"头条","author_name":"璞玉话体坛","url":"http://mini.eastday.com/mobile/190505183248056.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/2019050518_f1c59b8e89ed4144ac01277bf78f4cf4_2167_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/2019050518_6c87c97c323f458e8ad1a4a3c28d774e_7659_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/2019050518_dae79f3490374ff0880f87edfe44db54_0928_cover_mwpm_03200403.jpg"},{"uniquekey":"b80566da3c3e10bd85138225c566d66f","title":"婚后过得最累的三大星座，忙碌不停，天生操心命！","date":"2019-05-05 18:32","category":"头条","author_name":"小熊时尚穿搭","url":"http://mini.eastday.com/mobile/190505183232013.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190505/2019050518_cbe647eb3b4746ec9b649fd607d56cb5_1460_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190505/2019050518_5fba8500f5b742188b69dada3773072f_9545_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190505/2019050518_171fe782f00948f0a07e16d2bcf70bd1_4152_mwpm_03200403.jpg"},{"uniquekey":"18bc0981ee1901da8778ab833d8828ea","title":"携手《中国好声音》总冠军梁博团队 陌陌王海鹭将推最新单曲","date":"2019-05-05 18:32","category":"头条","author_name":"华声在线","url":"http://mini.eastday.com/mobile/190505183211706.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190505/20190505183211_135e2b54c4d007c148701c656e9bf81a_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190505/20190505183211_135e2b54c4d007c148701c656e9bf81a_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190505/20190505183211_135e2b54c4d007c148701c656e9bf81a_3_mwpm_03200403.jpg"},{"uniquekey":"dfa873feb6dde5066f4841da479458dc","title":"证监会并购重组委20人拟任名单公示：11人来自证监系统","date":"2019-05-05 18:31","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/190505183152309.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505183152_6219abf6d56c406065e0a9f0c015e5f2_1_mwpm_03200403.jpg"},{"uniquekey":"db9cb1d3dd9fc41b5f370efaa8da4e96","title":"宁夏6项\u201c狠招\u201d治理普通高中自主招生\u201c乱象\u201d","date":"2019-05-05 18:31","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190505183138867.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190505/20190505183138_5d55156a96cc165a786f5d23df0cdac0_1_mwpm_03200403.jpg"},{"uniquekey":"82198a16da658409447d10d66f967f40","title":"原创 开心一刻：李姐找了个比她爸还要大的男友，这天她带着男友回家","date":"2019-05-05 18:31","category":"头条","author_name":"君叔笑话","url":"http://mini.eastday.com/mobile/190505183138051.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505183138_e1076aa1e610326dd2f1e9812bc172b5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505183138_e1076aa1e610326dd2f1e9812bc172b5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505183138_e1076aa1e610326dd2f1e9812bc172b5_3_mwpm_03200403.jpg"},{"uniquekey":"d37c6e9327f673e66603f29f1c6b7e7b","title":"看完章子怡素颜，男人都怀疑人生，看汪峰素颜，女人都说糟老头子","date":"2019-05-05 18:29","category":"头条","author_name":"冷雨夜","url":"http://mini.eastday.com/mobile/190505182949650.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505182949_4c7e2313f4cef410f87913e929a0366e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505182949_4c7e2313f4cef410f87913e929a0366e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505182949_4c7e2313f4cef410f87913e929a0366e_4_mwpm_03200403.jpg"},{"uniquekey":"4930c9828f8a0d513f7b5b834a0c5836","title":"月底，斗转星移，岁月如梭，心心相印到白头，复合在即的星座","date":"2019-05-05 18:25","category":"头条","author_name":"星星的低语","url":"http://mini.eastday.com/mobile/190505182550327.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505182550_a37e6bba2486fe568b34e8cd475f938f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505182550_a37e6bba2486fe568b34e8cd475f938f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505182550_a37e6bba2486fe568b34e8cd475f938f_1_mwpm_03200403.jpg"},{"uniquekey":"267b022d337c0b547e1aeb43229c38de","title":"不择手段！美国强势关闭伊朗地区GPS系统，俄罗斯将出手支援","date":"2019-05-05 18:25","category":"头条","author_name":"东方头条 芊微防务观察","url":"http://mini.eastday.com/mobile/190505182503641.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190505/2019050518_411c719a6b8e4355a12753c8557e9e82_0025_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190505/2019050518_12603d1bca1b477ca7dde31eaf242c84_4657_mwpm_03200403.jpg"},{"uniquekey":"3c3db0eefb71eaf34a4f79bf8710ecbd","title":"信阳市扫黑除恶专项斗争第八次推进会，孙同占强调这些事","date":"2019-05-05 18:24","category":"头条","author_name":"中原盾","url":"http://mini.eastday.com/mobile/190505182424711.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190505/20190505182424_5a97559e3eee044d0474ace7f61cc8a7_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190505/20190505182424_5a97559e3eee044d0474ace7f61cc8a7_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190505/20190505182424_5a97559e3eee044d0474ace7f61cc8a7_3_mwpm_03200403.jpg"},{"uniquekey":"25fbc8151c31594f05ff4e9bb24076c4","title":"曾是好莱坞票房保障，力捧儿子17年，没想到自己却过气了","date":"2019-05-05 18:24","category":"头条","author_name":"尚之潮","url":"http://mini.eastday.com/mobile/190505182405899.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190505/20190505182405_3c4d48044d841694f603f91b0336eacd_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190505/20190505182405_3c4d48044d841694f603f91b0336eacd_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190505/20190505182405_3c4d48044d841694f603f91b0336eacd_2_mwpm_03200403.jpg"},{"uniquekey":"a0ba9883e3a82b1e447d766602fdd6ba","title":"面粉别再只做白馒头了，做的时候里面加点红豆，小朋友们都爱吃","date":"2019-05-05 18:23","category":"头条","author_name":"美食圈","url":"http://mini.eastday.com/mobile/190505182356715.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505182356_23a1de05b2940183852bb3be1c72efff_9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505182356_23a1de05b2940183852bb3be1c72efff_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505182356_23a1de05b2940183852bb3be1c72efff_7_mwpm_03200403.jpg"},{"uniquekey":"cf5400ce78c0e8f73d0961a8d74be573","title":"1个月内，4位院士先后抵达，只为西北大学而来！","date":"2019-05-05 18:23","category":"头条","author_name":"西北大学招生办","url":"http://mini.eastday.com/mobile/190505182339254.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505182339_4b331a0260a965ddcb45515c75445851_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505182339_4b331a0260a965ddcb45515c75445851_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505182339_4b331a0260a965ddcb45515c75445851_3_mwpm_03200403.jpg"},{"uniquekey":"00b8331c52cbb43cbbc22117d81a00bc","title":"欧冠次回合逆转3球有多难？改制后仅3次，利物浦希望尚存！","date":"2019-05-05 18:22","category":"头条","author_name":"掌上球事APP","url":"http://mini.eastday.com/mobile/190505182254533.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505182254_bd41a2e284d7cb6780e14e6883db89a4_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505182254_bd41a2e284d7cb6780e14e6883db89a4_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505182254_bd41a2e284d7cb6780e14e6883db89a4_2_mwpm_03200403.jpg"},{"uniquekey":"8d5b6a84d20fa4ef130b9fbc44698e3d","title":"昔日的奥运冠军 曾经的女排国手 刘亚男中国女排的\u201c第一女神\u201d","date":"2019-05-05 18:22","category":"头条","author_name":"小帆谈娱乐","url":"http://mini.eastday.com/mobile/190505182252797.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/20190505182252_c9430534e4c05203eab301e70429638a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/20190505182252_c9430534e4c05203eab301e70429638a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/20190505182252_c9430534e4c05203eab301e70429638a_4_mwpm_03200403.jpg"},{"uniquekey":"2e22ad5039592881fe15ccddbac621e9","title":"平安产险河南分公司 \u201c安全出行，信任护航\u201d五一护航活动圆满收官","date":"2019-05-05 18:22","category":"头条","author_name":"映象网","url":"http://mini.eastday.com/mobile/190505182241150.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505182241_cc1dc2d931b656d27460bb4830930bfb_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505182241_cc1dc2d931b656d27460bb4830930bfb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505182241_cc1dc2d931b656d27460bb4830930bfb_5_mwpm_03200403.jpg"},{"uniquekey":"372a5e378c47d6b03bc12dc39465923b","title":"小米荣耀劲敌上线！realme X即将解除封印，概念海报引起热议","date":"2019-05-05 18:19","category":"头条","author_name":"科技face","url":"http://mini.eastday.com/mobile/190505181922858.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190505/20190505181922_7ed42f0e4131d7fc8945584c5ce03a40_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190505/20190505181922_7ed42f0e4131d7fc8945584c5ce03a40_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190505/20190505181922_7ed42f0e4131d7fc8945584c5ce03a40_3_mwpm_03200403.jpg"},{"uniquekey":"0cd90de076142a3728d64e0d662d564b","title":"街拍女神：时下最流行的紧身裤，展现美女的极致身材","date":"2019-05-05 18:19","category":"头条","author_name":"美肤小霸王","url":"http://mini.eastday.com/mobile/190505181916342.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190505/2019050518_ac6c99fc9001444fa09fcc3c24ced33d_0148_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190505/2019050518_e1b39d9af45841bba5c76591b05d32fc_2711_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190505/2019050518_b107dfe7a61a48eda8044198fde4d35f_6042_cover_mwpm_03200403.jpg"},{"uniquekey":"00f9ca9857df9c5a859427d2066a8f6f","title":"她是最没骨气的梁山女神，不仅给敌人暖床，还为敌人征战而死","date":"2019-05-05 18:17","category":"头条","author_name":"快乐的猫","url":"http://mini.eastday.com/mobile/190505181701994.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20190505/2019050518_96a2a9d9d29d49b98d06146bef0fc595_1623_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20190505/2019050518_9e6a384bcc144889b7cffaa7604afeaf_3664_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20190505/2019050518_b946eb78e0a24f80bcf90d1e36146847_3936_mwpm_03200403.jpg"},{"uniquekey":"2f40c46a5c907e2efdd24bd32c2facd8","title":"笑里藏刀？特朗普突然宣布重大决定，\u201c邀请\u201d中国，中方明确拒绝","date":"2019-05-05 18:16","category":"头条","author_name":"经典军事","url":"http://mini.eastday.com/mobile/190505181632769.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190505/20190505181632_b4df580ef449fc9e4fed700eb5c43849_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190505/20190505181632_b4df580ef449fc9e4fed700eb5c43849_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20190505/20190505181632_b4df580ef449fc9e4fed700eb5c43849_3_mwpm_03200403.jpg"},{"uniquekey":"b6883b68dc2808e2d43093f3efb6088b","title":"优速快递董事长夫妻双双身亡 生前疑曾发生争执","date":"2019-05-05 18:16","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/190505181623670.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190505/20190505182139_9b819575f6834464c23285007fcac570_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190505/20190505182139_9b819575f6834464c23285007fcac570_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190505/20190505182139_9b819575f6834464c23285007fcac570_3_mwpm_03200403.jpg"}]
         */

        @SerializedName ("stat")
        private String stat;
        @SerializedName ("data")
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : f5e4622878a4dbc97fcb9eb4c315cf44
             * title : 咸阳秦都国土资源分局延伸监督链条促进扫黑除恶专项斗争
             * date : 2019-05-05 18:59
             * category : 头条
             * author_name : 西部法制报
             * url : http://mini.eastday.com/mobile/190505185923933.html
             * thumbnail_pic_s : http://01imgmini.eastday.com/mobile/20190505/20190505185923_b87a36d630c7713e9350a3f87424bb9b_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://01imgmini.eastday.com/mobile/20190505/20190505185923_b87a36d630c7713e9350a3f87424bb9b_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://07imgmini.eastday.com/mobile/20190505/20190505185555_e373c51eb31f9e23e44fc72bd8655148_5_mwpm_03200403.jpg
             */

            @SerializedName ("uniquekey")
            private String uniquekey;
            @SerializedName ("title")
            private String title;
            @SerializedName ("date")
            private String date;
            @SerializedName ("category")
            private String category;
            @SerializedName ("author_name")
            private String authorName;
            @SerializedName ("url")
            private String url;
            @SerializedName ("thumbnail_pic_s")
            private String thumbnailPicS;
            @SerializedName ("thumbnail_pic_s02")
            private String thumbnailPicS02;
            @SerializedName ("thumbnail_pic_s03")
            private String thumbnailPicS03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthorName() {
                return authorName;
            }

            public void setAuthorName(String authorName) {
                this.authorName = authorName;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnailPicS() {
                return thumbnailPicS;
            }

            public void setThumbnailPicS(String thumbnailPicS) {
                this.thumbnailPicS = thumbnailPicS;
            }

            public String getThumbnailPicS02() {
                return thumbnailPicS02;
            }

            public void setThumbnailPicS02(String thumbnailPicS02) {
                this.thumbnailPicS02 = thumbnailPicS02;
            }

            public String getThumbnailPicS03() {
                return thumbnailPicS03;
            }

            public void setThumbnailPicS03(String thumbnailPicS03) {
                this.thumbnailPicS03 = thumbnailPicS03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", authorName='" + authorName + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnailPicS='" + thumbnailPicS + '\'' +
                        ", thumbnailPicS02='" + thumbnailPicS02 + '\'' +
                        ", thumbnailPicS03='" + thumbnailPicS03 + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "NewsResult{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", errorCode=" + errorCode +
                '}';
    }
}
