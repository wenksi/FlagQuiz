package ch.wenksi.quizapp

import kotlin.random.Random

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getNations(): ArrayList<Nation> {
        val nationList = ArrayList<Nation>()
        nationList.add(Nation(1, R.drawable.flag_ad, "Andorra"))
        nationList.add(Nation(2, R.drawable.flag_ae, "United Arab Emirates"))
        nationList.add(Nation(3, R.drawable.flag_af, "Afghanistan"))
        nationList.add(Nation(4, R.drawable.flag_ag, "Antigua and Barbuda"))
        nationList.add(Nation(5, R.drawable.flag_ai, "Anguilla"))
        nationList.add(Nation(6, R.drawable.flag_al, "Albania"))
        nationList.add(Nation(7, R.drawable.flag_am, "Armenia"))
        nationList.add(Nation(8, R.drawable.flag_ao, "Angola"))
        nationList.add(Nation(9, R.drawable.flag_aq, "Antarctica"))
        nationList.add(Nation(10, R.drawable.flag_ar, "Argentina"))
        nationList.add(Nation(11, R.drawable.flag_as, "American Samoa"))
        nationList.add(Nation(12, R.drawable.flag_at, "Austria"))
        nationList.add(Nation(13, R.drawable.flag_au, "Australia"))
        nationList.add(Nation(14, R.drawable.flag_aw, "Aruba"))
        nationList.add(Nation(15, R.drawable.flag_ax, "Aland Islands"))
        nationList.add(Nation(16, R.drawable.flag_az, "Azerbaijan"))
        nationList.add(Nation(17, R.drawable.flag_ba, "Bosnia and Herzegovina"))
        nationList.add(Nation(18, R.drawable.flag_bb, "Barbados"))
        nationList.add(Nation(19, R.drawable.flag_bd, "Bangladesh"))
        nationList.add(Nation(20, R.drawable.flag_be, "Belgium"))
        nationList.add(Nation(21, R.drawable.flag_bf, "Burkina Faso"))
        nationList.add(Nation(22, R.drawable.flag_bg, "Bulgaria"))
        nationList.add(Nation(23, R.drawable.flag_bh, "Bahrain"))
        nationList.add(Nation(24, R.drawable.flag_bi, "Burundi"))
        nationList.add(Nation(25, R.drawable.flag_bj, "Benin"))
        nationList.add(Nation(26, R.drawable.flag_bl, "Saint Barthelemy"))
        nationList.add(Nation(27, R.drawable.flag_bm, "Bermuda"))
        nationList.add(Nation(28, R.drawable.flag_bn, "Brunei Darussalam"))
        nationList.add(Nation(29, R.drawable.flag_bo, "Bolivia"))
        nationList.add(Nation(30, R.drawable.flag_bq, "Bonaire, St. Eustatius, and Saba"))
        nationList.add(Nation(31, R.drawable.flag_br, "Brazil"))
        nationList.add(Nation(32, R.drawable.flag_bs, "Bahamas"))
        nationList.add(Nation(33, R.drawable.flag_bt, "Bhutan"))
        nationList.add(Nation(34, R.drawable.flag_bv, "Bouvet Island"))
        nationList.add(Nation(35, R.drawable.flag_bw, "Botswana"))
        nationList.add(Nation(36, R.drawable.flag_by, "Belarus"))
        nationList.add(Nation(37, R.drawable.flag_bz, "Belize"))
        nationList.add(Nation(38, R.drawable.flag_ca, "Canada"))
        nationList.add(Nation(39, R.drawable.flag_cc, "Cocos Islands"))
        nationList.add(Nation(40, R.drawable.flag_cd, "Democratic Republic of Congo"))
        nationList.add(Nation(41, R.drawable.flag_cf, "Central African"))
        nationList.add(Nation(42, R.drawable.flag_cg, "Republic of Congo"))
        nationList.add(Nation(43, R.drawable.flag_ch, "Switzerland"))
        nationList.add(Nation(44, R.drawable.flag_ci, "Cote d'Ivoire"))
        nationList.add(Nation(45, R.drawable.flag_ck, "Cook Islands"))
        nationList.add(Nation(46, R.drawable.flag_cl, "Chile"))
        nationList.add(Nation(47, R.drawable.flag_cm, "Cameroon"))
        nationList.add(Nation(48, R.drawable.flag_cn, "China"))
        nationList.add(Nation(49, R.drawable.flag_co, "Colombia"))
        nationList.add(Nation(50, R.drawable.flag_cr, "Costa Rica"))
        nationList.add(Nation(51, R.drawable.flag_cu, "Cuba"))
        nationList.add(Nation(52, R.drawable.flag_cv, "Cape Verde"))
        nationList.add(Nation(53, R.drawable.flag_cw, "Curacao"))
        nationList.add(Nation(54, R.drawable.flag_cx, "Christmas Island"))
        nationList.add(Nation(55, R.drawable.flag_cy, "Cyprus"))
        nationList.add(Nation(56, R.drawable.flag_cz, "Czech Republic"))
        nationList.add(Nation(57, R.drawable.flag_de, "Germany"))
        nationList.add(Nation(58, R.drawable.flag_dj, "Djibouti"))
        nationList.add(Nation(59, R.drawable.flag_dk, "Denmark"))
        nationList.add(Nation(60, R.drawable.flag_dm, "Dominica"))
        nationList.add(Nation(61, R.drawable.flag_do, "Dominican Republic"))
        nationList.add(Nation(62, R.drawable.flag_dz, "Algeria"))
        nationList.add(Nation(63, R.drawable.flag_ec, "Ecuador"))
        nationList.add(Nation(64, R.drawable.flag_ee, "Estonia"))
        nationList.add(Nation(65, R.drawable.flag_eg, "Egypt"))
        nationList.add(Nation(66, R.drawable.flag_eh, "Western Sahara"))
        nationList.add(Nation(67, R.drawable.flag_er, "Eritrea"))
        nationList.add(Nation(68, R.drawable.flag_es, "Spain"))
        nationList.add(Nation(69, R.drawable.flag_et, "Ethiopia"))
        nationList.add(Nation(70, R.drawable.flag_fi, "Finland"))
        nationList.add(Nation(71, R.drawable.flag_fj, "Fiji"))
        nationList.add(Nation(72, R.drawable.flag_fk, "Falkland Islands"))
        nationList.add(Nation(73, R.drawable.flag_fm, "Micronesia"))
        nationList.add(Nation(74, R.drawable.flag_fo, "Faeroe Islands"))
        nationList.add(Nation(75, R.drawable.flag_fr, "France"))
        nationList.add(Nation(76, R.drawable.flag_ga, "Gabon"))
        nationList.add(Nation(77, R.drawable.flag_gb, "Great Britain"))
        nationList.add(Nation(78, R.drawable.flag_gb_eng, "Andorra"))
        nationList.add(Nation(79, R.drawable.flag_gb_nir, "North Ireland"))
        nationList.add(Nation(80, R.drawable.flag_gb_sct, "Scotland"))
        nationList.add(Nation(81, R.drawable.flag_gb_wls, "Wales"))
        nationList.add(Nation(82, R.drawable.flag_gd, "Grenada"))
        nationList.add(Nation(83, R.drawable.flag_ge, "Georgia"))
        nationList.add(Nation(84, R.drawable.flag_gf, "French Guiana"))
        nationList.add(Nation(85, R.drawable.flag_gg, "Andorra"))
        nationList.add(Nation(86, R.drawable.flag_gh, "Andorra"))
        nationList.add(Nation(87, R.drawable.flag_gi, "Andorra"))
        nationList.add(Nation(88, R.drawable.flag_gl, "Andorra"))
        nationList.add(Nation(89, R.drawable.flag_gm, "Andorra"))
        nationList.add(Nation(90, R.drawable.flag_gn, "Ghana"))
        nationList.add(Nation(91, R.drawable.flag_gp, "Andorra"))
        nationList.add(Nation(92, R.drawable.flag_gq, "Andorra"))
        nationList.add(Nation(93, R.drawable.flag_gr, "Greece"))
        nationList.add(Nation(94, R.drawable.flag_gs, "Andorra"))
        nationList.add(Nation(95, R.drawable.flag_gt, "Andorra"))
        nationList.add(Nation(96, R.drawable.flag_gu, "Andorra"))
        nationList.add(Nation(97, R.drawable.flag_gw, "Andorra"))
        nationList.add(Nation(98, R.drawable.flag_gy, "Andorra"))
        nationList.add(Nation(99, R.drawable.flag_hk, "Hong Kong"))
        nationList.add(Nation(100, R.drawable.flag_hm, "Andorra"))
        nationList.add(Nation(101, R.drawable.flag_hn, "Andorra"))
        nationList.add(Nation(102, R.drawable.flag_hr, "Andorra"))
        nationList.add(Nation(103, R.drawable.flag_ht, "Andorra"))
        nationList.add(Nation(104, R.drawable.flag_hu, "Andorra"))
        nationList.add(Nation(105, R.drawable.flag_id, "Andorra"))
        nationList.add(Nation(106, R.drawable.flag_ie, "Andorra"))
        nationList.add(Nation(107, R.drawable.flag_il, "Israel"))
        nationList.add(Nation(108, R.drawable.flag_im, "Andorra"))
        nationList.add(Nation(109, R.drawable.flag_in, "India"))
        nationList.add(Nation(110, R.drawable.flag_io, "Andorra"))
        nationList.add(Nation(111, R.drawable.flag_iq, "Andorra"))
        nationList.add(Nation(112, R.drawable.flag_ir, "Ireland"))
        nationList.add(Nation(113, R.drawable.flag_it, "Italia"))
        nationList.add(Nation(114, R.drawable.flag_je, "Andorra"))
        nationList.add(Nation(115, R.drawable.flag_jm, "Jamaica"))
        nationList.add(Nation(116, R.drawable.flag_jo, "Andorra"))
        nationList.add(Nation(117, R.drawable.flag_jp, "Japan"))
        nationList.add(Nation(118, R.drawable.flag_je, "Andorra"))
        nationList.add(Nation(119, R.drawable.flag_ke, "Andorra"))
        nationList.add(Nation(120, R.drawable.flag_kg, "Andorra"))
        nationList.add(Nation(121, R.drawable.flag_kh, "Andorra"))
        nationList.add(Nation(122, R.drawable.flag_ki, "Andorra"))
        nationList.add(Nation(123, R.drawable.flag_km, "Andorra"))
        nationList.add(Nation(124, R.drawable.flag_kn, "Andorra"))
        nationList.add(Nation(125, R.drawable.flag_kp, "Andorra"))
        nationList.add(Nation(126, R.drawable.flag_kr, "South Korea"))
        nationList.add(Nation(127, R.drawable.flag_kw, "Andorra"))
        nationList.add(Nation(128, R.drawable.flag_ky, "Andorra"))
        nationList.add(Nation(129, R.drawable.flag_kz, "Andorra"))
        nationList.add(Nation(130, R.drawable.flag_la, "Andorra"))
        nationList.add(Nation(131, R.drawable.flag_lb, "Andorra"))
        nationList.add(Nation(132, R.drawable.flag_lc, "Andorra"))
        nationList.add(Nation(133, R.drawable.flag_li, "Andorra"))
        nationList.add(Nation(134, R.drawable.flag_lk, "Andorra"))
        nationList.add(Nation(135, R.drawable.flag_lr, "Andorra"))
        nationList.add(Nation(136, R.drawable.flag_ls, "Andorra"))
        nationList.add(Nation(137, R.drawable.flag_lt, "Andorra"))
        nationList.add(Nation(138, R.drawable.flag_lu, "Andorra"))
        nationList.add(Nation(139, R.drawable.flag_lv, "Latvia"))
        nationList.add(Nation(140, R.drawable.flag_ly, "Andorra"))
        nationList.add(Nation(141, R.drawable.flag_ma, "Andorra"))
        nationList.add(Nation(142, R.drawable.flag_mc, "Andorra"))
        nationList.add(Nation(143, R.drawable.flag_md, "Andorra"))
        nationList.add(Nation(144, R.drawable.flag_me, "Andorra"))
        nationList.add(Nation(145, R.drawable.flag_mf, "Andorra"))
        nationList.add(Nation(146, R.drawable.flag_mg, "Andorra"))
        nationList.add(Nation(147, R.drawable.flag_mh, "Andorra"))
        nationList.add(Nation(148, R.drawable.flag_mk, "Andorra"))
        nationList.add(Nation(149, R.drawable.flag_ml, "Andorra"))
        nationList.add(Nation(150, R.drawable.flag_mm, "Andorra"))
        nationList.add(Nation(151, R.drawable.flag_mn, "Andorra"))
        nationList.add(Nation(152, R.drawable.flag_mo, "Andorra"))
        nationList.add(Nation(153, R.drawable.flag_mp, "Andorra"))
        nationList.add(Nation(154, R.drawable.flag_mq, "Andorra"))
        nationList.add(Nation(155, R.drawable.flag_mr, "Andorra"))
        nationList.add(Nation(156, R.drawable.flag_ms, "Andorra"))
        nationList.add(Nation(157, R.drawable.flag_mt, "Andorra"))
        nationList.add(Nation(158, R.drawable.flag_mu, "Andorra"))
        nationList.add(Nation(159, R.drawable.flag_mv, "Andorra"))
        nationList.add(Nation(160, R.drawable.flag_mw, "Andorra"))
        nationList.add(Nation(161, R.drawable.flag_mx, "Andorra"))
        nationList.add(Nation(162, R.drawable.flag_my, "Andorra"))
        nationList.add(Nation(163, R.drawable.flag_mz, "Andorra"))
        nationList.add(Nation(164, R.drawable.flag_na, "Andorra"))
        nationList.add(Nation(165, R.drawable.flag_nc, "Andorra"))
        nationList.add(Nation(166, R.drawable.flag_ne, "Andorra"))
        nationList.add(Nation(167, R.drawable.flag_nf, "Andorra"))
        nationList.add(Nation(168, R.drawable.flag_ng, "Nigeria"))
        nationList.add(Nation(169, R.drawable.flag_ni, "Andorra"))
        nationList.add(Nation(170, R.drawable.flag_nl, "Netherlands"))
        nationList.add(Nation(171, R.drawable.flag_no, "Norway"))
        nationList.add(Nation(172, R.drawable.flag_np, "Andorra"))
        nationList.add(Nation(173, R.drawable.flag_nr, "Andorra"))
        nationList.add(Nation(174, R.drawable.flag_nu, "Andorra"))
        nationList.add(Nation(175, R.drawable.flag_nz, "New Zealand"))
        nationList.add(Nation(176, R.drawable.flag_om, "Andorra"))
        nationList.add(Nation(177, R.drawable.flag_pa, "Andorra"))
        nationList.add(Nation(178, R.drawable.flag_pe, "Andorra"))
        nationList.add(Nation(179, R.drawable.flag_pf, "Andorra"))
        nationList.add(Nation(180, R.drawable.flag_pg, "Andorra"))
        nationList.add(Nation(181, R.drawable.flag_ph, "Andorra"))
        nationList.add(Nation(182, R.drawable.flag_pk, "Andorra"))
        nationList.add(Nation(183, R.drawable.flag_pl, "Poland"))
        nationList.add(Nation(184, R.drawable.flag_pm, "Andorra"))
        nationList.add(Nation(185, R.drawable.flag_pn, "Andorra"))
        nationList.add(Nation(186, R.drawable.flag_pr, "Andorra"))
        nationList.add(Nation(187, R.drawable.flag_ps, "Andorra"))
        nationList.add(Nation(188, R.drawable.flag_pt, "Andorra"))
        nationList.add(Nation(189, R.drawable.flag_pw, "Andorra"))
        nationList.add(Nation(190, R.drawable.flag_py, "Andorra"))
        nationList.add(Nation(191, R.drawable.flag_qa, "Andorra"))
        nationList.add(Nation(192, R.drawable.flag_re, "Andorra"))
        nationList.add(Nation(193, R.drawable.flag_ro, "Romania"))
        nationList.add(Nation(194, R.drawable.flag_rs, "Andorra"))
        nationList.add(Nation(195, R.drawable.flag_ru, "Russia"))
        nationList.add(Nation(196, R.drawable.flag_rw, "Andorra"))
        nationList.add(Nation(197, R.drawable.flag_sa, "Saudi Arabia"))
        nationList.add(Nation(198, R.drawable.flag_sb, "Andorra"))
        nationList.add(Nation(199, R.drawable.flag_sc, "Andorra"))
        nationList.add(Nation(200, R.drawable.flag_sd, "Andorra"))
        nationList.add(Nation(201, R.drawable.flag_se, "Sweden"))
        nationList.add(Nation(202, R.drawable.flag_sg, "Andorra"))
        nationList.add(Nation(203, R.drawable.flag_sh, "Andorra"))
        nationList.add(Nation(204, R.drawable.flag_si, "Andorra"))
        nationList.add(Nation(205, R.drawable.flag_sj, "Andorra"))
        nationList.add(Nation(206, R.drawable.flag_sk, "Andorra"))
        nationList.add(Nation(207, R.drawable.flag_sl, "Andorra"))
        nationList.add(Nation(208, R.drawable.flag_sm, "Andorra"))
        nationList.add(Nation(209, R.drawable.flag_sn, "Andorra"))
        nationList.add(Nation(210, R.drawable.flag_so, "Andorra"))
        nationList.add(Nation(211, R.drawable.flag_sr, "Andorra"))
        nationList.add(Nation(212, R.drawable.flag_ss, "Andorra"))
        nationList.add(Nation(213, R.drawable.flag_st, "Andorra"))
        nationList.add(Nation(214, R.drawable.flag_sv, "Andorra"))
        nationList.add(Nation(215, R.drawable.flag_sx, "Andorra"))
        nationList.add(Nation(216, R.drawable.flag_sy, "Andorra"))
        nationList.add(Nation(217, R.drawable.flag_sz, "Andorra"))
        nationList.add(Nation(218, R.drawable.flag_tc, "Andorra"))
        nationList.add(Nation(220, R.drawable.flag_td, "Andorra"))
        nationList.add(Nation(221, R.drawable.flag_tf, "Andorra"))
        nationList.add(Nation(222, R.drawable.flag_tg, "Togo"))
        nationList.add(Nation(223, R.drawable.flag_th, "Thailand"))
        nationList.add(Nation(224, R.drawable.flag_tj, "Andorra"))
        nationList.add(Nation(225, R.drawable.flag_tk, "Andorra"))
        nationList.add(Nation(226, R.drawable.flag_tl, "Andorra"))
        nationList.add(Nation(227, R.drawable.flag_tm, "Andorra"))
        nationList.add(Nation(228, R.drawable.flag_tn, "Andorra"))
        nationList.add(Nation(229, R.drawable.flag_to, "Andorra"))
        nationList.add(Nation(230, R.drawable.flag_tr, "Turkey"))
        nationList.add(Nation(231, R.drawable.flag_tt, "Andorra"))
        nationList.add(Nation(232, R.drawable.flag_tv, "Andorra"))
        nationList.add(Nation(233, R.drawable.flag_tw, "Andorra"))
        nationList.add(Nation(234, R.drawable.flag_tz, "Andorra"))
        nationList.add(Nation(235, R.drawable.flag_ua, "Andorra"))
        nationList.add(Nation(236, R.drawable.flag_ug, "Andorra"))
        nationList.add(Nation(237, R.drawable.flag_um, "Andorra"))
        nationList.add(Nation(238, R.drawable.flag_us, "United States of America"))
        nationList.add(Nation(239, R.drawable.flag_uy, "Uruguay"))
        nationList.add(Nation(240, R.drawable.flag_uz, "Andorra"))
        nationList.add(Nation(241, R.drawable.flag_va, "Andorra"))
        nationList.add(Nation(242, R.drawable.flag_vc, "Andorra"))
        nationList.add(Nation(243, R.drawable.flag_ve, "Andorra"))
        nationList.add(Nation(244, R.drawable.flag_vg, "Andorra"))
        nationList.add(Nation(245, R.drawable.flag_vi, "Andorra"))
        nationList.add(Nation(246, R.drawable.flag_vn, "Vietnam"))
        nationList.add(Nation(247, R.drawable.flag_vu, "Andorra"))
        nationList.add(Nation(248, R.drawable.flag_wf, "Andorra"))
        nationList.add(Nation(249, R.drawable.flag_ws, "Andorra"))
        nationList.add(Nation(250, R.drawable.flag_xk, "Andorra"))
        nationList.add(Nation(251, R.drawable.flag_ye, "Andorra"))
        nationList.add(Nation(252, R.drawable.flag_yt, "Andorra"))
        nationList.add(Nation(253, R.drawable.flag_za, "Andorra"))
        nationList.add(Nation(254, R.drawable.flag_zm, "Andorra"))
        nationList.add(Nation(255, R.drawable.flag_zw, "Andorra"))
        return nationList
    }

    fun getQuestions(): ArrayList<Question> {
        val nationList = this.getNations()
        val questionsList = ArrayList<Question>()

        for (i in 1..10) {
            var rand = Random.nextInt(0, nationList.size - 1)
            val correctNation: Nation = nationList[rand]
            nationList.removeAt(rand)

            rand = Random.nextInt(0, nationList.size - 1)
            val wrongNationOne: Nation = nationList[rand]
            nationList.removeAt(rand)

            rand = Random.nextInt(0, nationList.size - 1)
            val wrongNationTwo: Nation = nationList[rand]
            nationList.removeAt(rand)

            rand = Random.nextInt(0, nationList.size - 1)
            val wrongNationThree: Nation = nationList[rand]
            nationList.removeAt(rand)

            when (val correctAnswer = Random.nextInt(1, 4)) {
                1 -> questionsList.add(Question(
                    i, "What country does this flag belong to?",
                    correctNation.image,
                    correctNation.name,
                    wrongNationOne.name,
                    wrongNationTwo.name,
                    wrongNationThree.name,
                    correctAnswer
                ))
                2 -> questionsList.add(Question(
                    i, "What country does this flag belong to?",
                    correctNation.image,
                    wrongNationOne.name,
                    correctNation.name,
                    wrongNationTwo.name,
                    wrongNationThree.name,
                    correctAnswer
                ))
                3 -> questionsList.add(Question(
                    i, "What country does this flag belong to?",
                    correctNation.image,
                    wrongNationOne.name,
                    wrongNationTwo.name,
                    correctNation.name,
                    wrongNationThree.name,
                    correctAnswer
                ))
                4 -> questionsList.add(Question(
                    i, "What country does this flag belong to?",
                    correctNation.image,
                    wrongNationOne.name,
                    wrongNationTwo.name,
                    wrongNationThree.name,
                    correctNation.name,
                    correctAnswer
                ))
            }
        }
        return questionsList
    }
}