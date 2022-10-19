var swiper = new Swiper(".mySwiper", {
    slidesPerView: 3,
    spaceBetween: 30,
    slidesPerGroup: 3,
    loop: true,
    loopFillGroupWithBlank: true,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
    navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
    },
    breakpoints: {
        "@0.00": {
            slidesPerView: 1,
            spaceBetween: 0,
            slidesPerGroup: 1,
        },
        "@0.75": {
            slidesPerView: 2,
            spaceBetween: 20,
            slidesPerGroup: 2,
        },
        "@1.00": {
            slidesPerView: 2,
            spaceBetween: 10,
            slidesPerGroup: 2,
        },
        "@1.50": {
            slidesPerView: 2,
            spaceBetween: 20,
            slidesPerGroup: 2,
        },
        "@1.75": {
            slidesPerView: 3,
            spaceBetween: 20,
            slidesPerGroup: 3,
        },
    },
});
// ...........................................................

let nCount = selector => {
    $(selector).each(function () {
        $(this)
            .animate({
                Counter: $(this).text()
            }, {
                duration: 7000,
                easing: "swing",
                step: function (value) {
                    $(this).text(Math.ceil(value));
                }
            });
    });
};
let a = 0;
$(window).scroll(function () {

    let oTop = $(".numbers").offset().top - window.innerHeight;
    if (a == 0 && $(window).scrollTop() >= oTop) {
        a++;
        nCount(".rect > h1");
    }
});