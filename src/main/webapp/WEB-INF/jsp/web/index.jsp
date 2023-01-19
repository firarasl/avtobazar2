<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 8/20/19
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <jsp:include page="meta.jsp"/>

    <title>AutoBazar.az Main Page</title>

    <jsp:include page="css.jsp"/>

    <!-- owl-carousel -->
    <link rel="stylesheet" type="text/css" href="${applicationContext}/css/owl-carousel/owl.carousel.css" />

    <!-- jquery-ui -->
    <link rel="stylesheet" type="text/css" href="${applicationContext}/css/jquery-ui.css" />

    <!-- revolution -->
    <link rel="stylesheet" type="text/css" href="${applicationContext}/revolution/css/settings.css">

</head>

<body>

<!--=================================
  loading -->

<div id="loading">
    <div id="loading-center">
        <img src="${applicationContext}/images/loader2.gif" alt="">
    </div>
</div>

<!--=================================
  loading -->


<!--=================================
 header -->

<header id="header" class="topbar-dark logo-right">
    <jsp:include page="topbar.jsp"/>

    <jsp:include page="menu.jsp"/>
</header>

<!--=================================
 header -->


<!--=================================
 rev slider -->

<div id="rev_slider_7_1_wrapper" class="rev_slider_wrapper fullwidthbanner-container" data-alias="slider-8" style="margin:0px auto;background-color:transparent;padding:0px;margin-top:0px;margin-bottom:0px;">
    <!-- START REVOLUTION SLIDER 5.2.6 fullwidth mode -->
    <div id="rev_slider_7_1" class="rev_slider fullwidthabanner" style="display:none;" data-version="5.2.6">
        <ul>  <!-- SLIDE  -->
            <li data-index="rs-13" data-transition="random-static,random-premium,random" data-slotamount="default,default,default,default" data-hideafterloop="0" data-hideslideonmobile="off"  data-randomtransition="on" data-easein="default,default,default,default" data-easeout="default,default,default,default" data-masterspeed="default,default,default,default"  data-thumb="${applicationContext}/revolution/assets/slider-7/100x50_road2.jpg"  data-rotate="0,0,0,0"  data-saveperformance="off"  data-title="Slide" data-param1="" data-param2="" data-param3="" data-param4="" data-param5="" data-param6="" data-param7="" data-param8="" data-param9="" data-param10="" data-description="">
                <!-- MAIN IMAGE -->
                <img src="${applicationContext}/revolution/assets/slider-7/road2.jpg"  alt=""  data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                <!-- LAYERS -->

                <!-- LAYER NR. 1 -->
                <div class="tp-caption   tp-resizeme"
                     id="slide-13-layer-1"
                     data-x="440"
                     data-y="250"
                     data-width="['none','none','none','none']"
                     data-height="['none','none','none','none']"
                     data-transform_idle="o:1;"

                     data-transform_in="x:-50px;opacity:0;s:1220;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="760"
                     data-responsive_offset="on"


                     style="z-index: 5;"><img src="${applicationContext}/revolution/assets/slider-7/motion-car2.png" alt="" data-ww="384px" data-hh="162px" data-no-retina> </div>

                <!-- LAYER NR. 2 -->
                <div class="tp-caption   tp-resizeme"
                     id="slide-13-layer-3"
                     data-x="570"
                     data-y="362"
                     data-width="['none','none','none','none']"
                     data-height="['none','none','none','none']"
                     data-transform_idle="o:1;"

                     data-transform_in="y:bottom;s:830;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="1460"
                     data-responsive_offset="on"


                     style="z-index: 6;"><img src="${applicationContext}/revolution/assets/slider-7/car-key.png" alt="" data-ww="207px" data-hh="136px" data-no-retina> </div>

                <!-- LAYER NR. 3 -->
                <div class="tp-caption   tp-resizeme"
                     id="slide-13-layer-4"
                     data-x="right" data-hoffset="740"
                     data-y="bottom" data-voffset=""
                     data-width="['none','none','none','none']"
                     data-height="['none','none','none','none']"
                     data-transform_idle="o:1;"

                     data-transform_in="y:bottom;s:1130;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="2140"
                     data-responsive_offset="on"


                     style="z-index: 7;"><img src="${applicationContext}/revolution/assets/slider-7/hand-with-tab.png" alt="" data-ww="403px" data-hh="473px" data-no-retina> </div>

                <!-- LAYER NR. 4 -->
                <div class="tp-caption   tp-resizeme"
                     id="slide-13-layer-5"
                     data-x="right" data-hoffset="544"
                     data-y="bottom" data-voffset=""
                     data-width="['none','none','none','none']"
                     data-height="['none','none','none','none']"
                     data-transform_idle="o:1;"

                     data-transform_in="y:bottom;s:930;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="2860"
                     data-responsive_offset="on"


                     style="z-index: 8;"><img src="${applicationContext}/revolution/assets/slider-7/right-hand.png" alt="" data-ww="269px" data-hh="306px" data-no-retina> </div>

                <!-- LAYER NR. 5 -->
                <div class="tp-caption   tp-resizeme"
                     id="slide-13-layer-6"
                     data-x="855"
                     data-y="189"
                     data-width="['auto']"
                     data-height="['auto']"
                     data-transform_idle="o:1;"

                     data-transform_in="x:50px;opacity:0;s:630;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="3500"
                     data-splitin="none"
                     data-splitout="none"
                     data-responsive_offset="on"


                     style="z-index: 9; white-space: nowrap; font-size: 48px; line-height: 60px; font-weight: 700; color: rgba(255, 255, 255, 1.00);font-family:Roboto;text-transform:uppercase;">Easy, <br>faster<br>& friendly </div>

                <!-- LAYER NR. 6 -->
                <div class="tp-caption rev-btn button white"
                     id="slide-13-layer-8"
                     data-x="862"
                     data-y="392"
                     data-width="['auto']"
                     data-height="['auto']"
                     data-transform_idle="o:1;"
                     data-transform_hover="o:1;rX:0;rY:0;rZ:0;z:0;s:0;e:Linear.easeNone;"
                     data-style_hover=""

                     data-transform_in="y:50px;opacity:0;s:700;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="3910"
                     data-splitin="none"
                     data-splitout="none"
                     data-responsive_offset="on"
                     data-responsive="off"

                     style="z-index: 10; white-space: nowrap; font-size: 17px; line-height: 17px; font-weight: 500; font-family:Roboto;text-transform:uppercase; outline:none;box-shadow:none;box-sizing:border-box;-moz-box-sizing:border-box;-webkit-box-sizing:border-box;cursor:pointer;">shopping now </div>
            </li>
            <!-- SLIDE  -->
            <li data-index="rs-14" data-transition="random-static,random-premium,random" data-slotamount="default,default,default,default" data-hideafterloop="0" data-hideslideonmobile="off"  data-randomtransition="on" data-easein="default,default,default,default" data-easeout="default,default,default,default" data-masterspeed="default,default,default,default"  data-thumb="${applicationContext}/revolution/assets/slider-7/100x50_7-mainbg.jpg"  data-rotate="0,0,0,0"  data-saveperformance="off"  data-title="Slide" data-param1="" data-param2="" data-param3="" data-param4="" data-param5="" data-param6="" data-param7="" data-param8="" data-param9="" data-param10="" data-description="">
                <!-- MAIN IMAGE -->
                <img src="${applicationContext}/revolution/assets/slider-7/7-mainbg.jpg"  alt=""  data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" class="rev-slidebg" data-no-retina>
                <!-- LAYERS -->

                <!-- LAYER NR. 1 -->
                <div class="tp-caption   tp-resizeme"
                     id="slide-14-layer-9"
                     data-x="20"
                     data-y="bottom" data-voffset="-35"
                     data-width="['none','none','none','none']"
                     data-height="['none','none','none','none']"
                     data-transform_idle="o:1;"

                     data-transform_in="y:bottom;s:1090;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="1080"
                     data-responsive_offset="on"


                     style="z-index: 5;"><img src="${applicationContext}/revolution/assets/slider-7/salseman.png" alt="" data-ww="527px" data-hh="525px" data-no-retina> </div>

                <!-- LAYER NR. 2 -->
                <div class="tp-caption   tp-resizeme"
                     id="slide-14-layer-10"
                     data-x="600"
                     data-y="190"
                     data-width="['auto']"
                     data-height="['auto']"
                     data-transform_idle="o:1;"

                     data-transform_in="x:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;s:960;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-mask_in="x:0px;y:0px;s:inherit;e:inherit;"
                     data-start="1880"
                     data-splitin="none"
                     data-splitout="none"
                     data-responsive_offset="on"


                     style="z-index: 6; white-space: nowrap; font-size: 48px; line-height: 60px; font-weight: 700; color: rgba(255, 255, 255, 1.00);font-family:Roboto;text-transform:uppercase;">do you <br>want / need<br>buy new car ? </div>

                <!-- LAYER NR. 3 -->
                <div class="tp-caption rev-btn button white"
                     id="slide-14-layer-11"
                     data-x="604"
                     data-y="400"
                     data-width="['auto']"
                     data-height="['auto']"
                     data-transform_idle="o:1;"
                     data-transform_hover="o:1;rX:0;rY:0;rZ:0;z:0;s:0;e:Linear.easeNone;"
                     data-style_hover=""

                     data-transform_in="y:50px;opacity:0;s:860;e:Power2.easeInOut;"
                     data-transform_out="opacity:0;s:300;"
                     data-start="2460"
                     data-splitin="none"
                     data-splitout="none"
                     data-responsive_offset="on"
                     data-responsive="off"

                     style="z-index: 7; white-space: nowrap; font-size: 17px; line-height: 17px; font-weight: 500;font-family:Roboto;text-transform:uppercase;padding:12px 35px 12px 35px;outline:none;box-shadow:none;box-sizing:border-box;-moz-box-sizing:border-box;-webkit-box-sizing:border-box;cursor:pointer;">shop with us </div>
            </li>
        </ul>
        <div class="tp-bannertimer tp-bottom" style="visibility: hidden !important;"></div> </div>
</div>

<!--=================================
 rev slider -->


<!--=================================
search -->

<section class="search white-bg">
    <div class="container">
        <div class="search-block red-bg">
            <div class="row">
                <div class="col-md-8">
                    <div class="row">
                        <div class="col-md-4">
                            <span>Select make</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Make </option>
                                    <option>BMW</option>
                                    <option>Honda </option>
                                    <option>Hyundai </option>
                                    <option>Nissan </option>
                                    <option>Mercedes Benz </option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select model</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Model</option>
                                    <option>3-Series</option>
                                    <option>Carrera</option>
                                    <option>GT-R</option>
                                    <option>Cayenne</option>
                                    <option>Mazda6</option>
                                    <option>Macan</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select Year</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Year</option>
                                    <option>2010</option>
                                    <option>2011</option>
                                    <option>2012</option>
                                    <option>2013</option>
                                    <option>2014</option>
                                    <option>2015</option>
                                    <option>2016</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select body style</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Body style</option>
                                    <option>2dr Car</option>
                                    <option>4dr Car</option>
                                    <option>Convertible</option>
                                    <option>Sedan</option>
                                    <option>Sports Utility</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <span>Select vehicle status</span>
                            <div class="selected-box">
                                <select class="selectpicker">
                                    <option>Vehicle Status</option>
                                    <option>Condition</option>
                                    <option>All Conditions</option>
                                    <option>Condition</option>
                                    <option>Brand New</option>
                                    <option>Slightly Used</option>
                                    <option>Used</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="price-slide">
                        <div class="price">
                            <label for="amount">Price Range</label>
                            <input type="text" id="amount" class="amount" value="$50 - $300" />
                            <div id="slider-range"></div>
                            <a class="button white" href="#">Search the Vehicle</a>
                            <a class="link" href="#">ADVANCED SEARCH</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!--=================================
search -->

<!--=================================
product-listing  -->

<section class="product-listing page-section-ptb">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-md-8">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/1.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">Acura Rsx</a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/2.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">Lexus GS 450h</a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/1.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">GTA 5 Lowriders DLC</a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/4.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">Toyota avalon hybrid </a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/5.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">Hyundai santa fe sport </a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/6.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">Lexus is f</a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/1.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">Acura Rsx</a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/3.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#">GTA 5 Lowriders DLC</a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="car-item gray-bg text-center">
                            <div class="car-image">
                                <img class="img-fluid" src="${applicationContext}/images/car/2.jpg" alt="">
                                <div class="car-overlay-banner">
                                    <ul>
                                        <li><a href="#"><i class="fa fa-link"></i></a></li>
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="car-list">
                                <ul class="list-inline">
                                    <li><i class="fa fa-registered"></i> 2016</li>
                                    <li><i class="fa fa-cog"></i> Manual </li>
                                    <li><i class="fa fa-shopping-cart"></i> 6,000 mi</li>
                                </ul>
                            </div>
                            <div class="car-content">
                                <div class="star">
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star orange-color"></i>
                                    <i class="fa fa-star-o orange-color"></i>
                                </div>
                                <a href="#"> Lexus GS 450h</a>
                                <div class="separator"></div>
                                <div class="price">
                                    <span class="old-price">$35,568</span>
                                    <span class="new-price">$32,698 </span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>









<br/>


                <!-- NEW POSTS -->
                <hr>
                <h3>Son Elanlar</h3><br/>


                <div class="row">


                    <c:forEach items="${requestScope.lastAutos}" var="auto">
                        <div class="col-lg-3">
                            <div class="car-item gray-bg text-center">
                                <div class="car-image">

                                    <img class="img-fluid" src="media?id=${auto.mainMediaId}" alt="">
                                    <div class="car-overlay-banner">
                                        <ul>
                                            <li><a href="#"><i class="fa fa-link"></i></a></li>
                                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="car-list">
                                    <ul class="list-inline">
                                        <li><i class="fa fa-registered"></i> ${auto.year}</li>
                                        <li><i class="fa fa-cog"></i> ${auto.id} </li>
                                        <li><i class="fa fa-shopping-cart"></i> ${auto.publishDate}</li>
                                    </ul>
                                </div>
                                <div class="car-content">
                                    <div class="star">
                                        <i class="fa fa-star orange-color"></i>
                                        <i class="fa fa-star orange-color"></i>
                                        <i class="fa fa-star orange-color"></i>
                                        <i class="fa fa-star orange-color"></i>
                                        <i class="fa fa-star-o orange-color"></i>
                                    </div>
                                    <a href="#">${auto.brand}</a>
                                    <a href="#">${auto.model}</a>
                                    <div class="separator"></div>
                                    <div class="price">
                                        <span class="old-price">${auto.price+1500}</span>
                                        <span class="new-price">${auto.price} </span>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </c:forEach>







            </div>

                <!-- END OF NEW POSTS -->



        </div>



    </div>
<hr>
        <div> <br/>
        <h3> BUTUN MARKALAR</h3><br/>
        <!-- BRANDS COUNT-->

            <div class="row">
                <c:forEach items="${requestScope.brandList}" var="brand">
                <div class="col-sm-4">
                       <span style="color: orangered;"> ${brand.quantity}</span> <ul style="list-style-type:circle;
                       display: inline-block;"><a href="#" > <li style="display: inline-block; display: list-item"
                > ${brand.brand}</li></a>
                    </ul>
                </div>
                </c:forEach>
            </div>

</div>
    </div>


</section>

<!--=================================
product-listing  -->

<!--=================================
 footer -->

<jsp:include page="footer.jsp"/>

<!--=================================
footer -->


<!--=================================
back to top -->

<div class="car-top">
    <span><img src="${applicationContext}/images/car.png" alt=""></span>
</div>

<!--=================================
back to top -->

<!--=================================
 jquery -->

<jsp:include page="js.jsp"/>

<!-- counter -->
<script type="text/javascript" src="${applicationContext}/js/counter/jquery.countTo.js"></script>

<!-- isotope -->
<script type="text/javascript" src="${applicationContext}/js/isotope/isotope.pkgd.min.js"></script>

<!-- owl-carousel -->
<script type="text/javascript" src="${applicationContext}/js/owl-carousel/owl.carousel.min.js"></script>

<!-- jquery-ui -->
<script type="text/javascript" src="${applicationContext}/js/jquery-ui.js"></script>

<!-- revolution -->
<script type="text/javascript" src="${applicationContext}/revolution/js/jquery.themepunch.tools.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/jquery.themepunch.revolution.min.js"></script>
<!-- SLIDER REVOLUTION 5.0 EXTENSIONS  (Load Extensions only on Local File Systems !  The following part can be removed on Server for On Demand Loading) -->
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.actions.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.carousel.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.kenburn.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.migration.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.parallax.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
<script type="text/javascript" src="${applicationContext}/revolution/js/extensions/revolution.extension.video.min.js"></script>


<script type="text/javascript">
    var tpj=jQuery;

    var revapi7;
    tpj(document).ready(function() {
        if(tpj("#rev_slider_7_1").revolution == undefined){
            revslider_showDoubleJqueryError("#rev_slider_7_1");
        }else{
            revapi7 = tpj("#rev_slider_7_1").show().revolution({
                sliderType:"standard",
                sliderLayout:"fullwidth",
                dottedOverlay:"none",
                delay:9000,
                navigation: {
                    keyboardNavigation:"off",
                    keyboard_direction: "horizontal",
                    mouseScrollNavigation:"off",
                    mouseScrollReverse:"default",
                    onHoverStop:"off",
                    arrows: {
                        style:"zeus",
                        enable:true,
                        hide_onmobile:false,
                        hide_onleave:false,
                        tmp:'<div class="tp-title-wrap">    <div class="tp-arr-imgholder"></div> </div>',
                        left: {
                            h_align:"left",
                            v_align:"center",
                            h_offset:20,
                            v_offset:0
                        },
                        right: {
                            h_align:"right",
                            v_align:"center",
                            h_offset:20,
                            v_offset:0
                        }
                    }
                },
                visibilityLevels:[1240,1024,778,480],
                gridwidth:1170,
                gridheight:630,
                lazyType:"none",
                shadow:0,
                spinner:"spinner0",
                stopLoop:"off",
                stopAfterLoops:-1,
                stopAtSlide:-1,
                shuffle:"off",
                autoHeight:"off",
                disableProgressBar:"on",
                hideThumbsOnMobile:"off",
                hideSliderAtLimit:0,
                hideCaptionAtLimit:0,
                hideAllCaptionAtLilmit:0,
                debugMode:false,
                fallbacks: {
                    simplifyAll:"off",
                    nextSlideOnWindowFocus:"off",
                    disableFocusListener:false,
                }
            });
        }
    }); /*ready*/
</script>

</body>

</html>