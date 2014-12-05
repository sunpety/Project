$(document).ready(function() {
	$('html').removeClass('no-js').addClass('js');
	
	// Dropdown menu
	$("ul.navList").superfish({
		delay:         300,
		animation:   {height:'show'},
		speed:       'fast'
	});
			
	$('.flexslider').flexslider({
    	animation: "slide"
  	});
	
	// Toggle boxes	
	$(".toggle").click(function(){
		$(this).toggleClass("active").parent().next().slideToggle();
		return false;
	});

	//Accordion
	$('#accordionOne').smoothAccordion();
	
	// Colorbox for images
	$("a.colorbox").colorbox({
		maxHeight: '90%',
		maxWidth: '90%'
	});
	
	// Hover style for colorbox images
	$("a.colorbox").hover( function(){ 
		$(this).find('img:first').animate({ opacity: 0.6 }, "fast"); 
		$(this).append('<img src="images/zoom.png" class="zoom" alt="zoom" />');
	}, function(){ 
		$(this).find('img:first').animate({ opacity: 1.0 }, "slow"); 
		$(this).find('img[class="zoom"]').remove();
	}); 	
		
	// Tabbed content
	$("#tabs1").organicTabs();
	$("#tabs2").organicTabs();

	// Sortable portfolio with Quicksand
	var $portfolioClone = $(".portfolio").clone();
	$(".filter a").click(function(e){
		$(".filter li").removeClass("current");	
		var $filterClass = $(this).parent().attr("class");
		if ( $filterClass == "all" ) {
			var $filteredPortfolio = $portfolioClone.find("li");
		} else {
			var $filteredPortfolio = $portfolioClone.find("li[data-type~=" + $filterClass + "]");
		}
		$(".portfolio").quicksand( $filteredPortfolio, { 
			duration: 800, 
			easing: 'easeInOutQuad' 
		}, function(){
			$(".portfolio a").hover( function(){ 
				$(this).children("img:first").animate({ opacity: 0.6 }, "fast"); 
				$(this).append('<img src="images/zoom.png" class="zoom" alt="zoom" />');
			}, function(){ 
				$(this).children("img:first").animate({ opacity: 1.0 }, "slow"); 
				$(this).find('img[class="zoom"]').remove();
			}); 
			$("a.colorbox").colorbox({
				maxHeight: '90%',
				maxWidth: '90%'
			});
		});
		$(this).parent().addClass("current");
		e.preventDefault();
	});

	//Contact form
	$('#contactform').submit(function(){
		var action = $(this).attr('action');
		$("#message").slideUp(750,function() {
		$('#message').hide();
 		$('#submit')
			.after('<img src="images/colorbox/loading.gif" class="loader" />')
			.attr('disabled','disabled');

		$.post(action, {
			name: $('#name').val(),
			email: $('#email').val(),
			//phone: $('#phone').val(),
			subject: $('#subject').val(),
			comments: $('#comments').val()
			//verify: $('#verify').val()
		},
			function(data){
				document.getElementById('message').innerHTML = data;
				$('#message').slideDown('slow');
				$('#contactform img.loader').fadeOut('slow',function(){$(this).remove()});
				$('#submit').removeAttr('disabled');
				if(data.match('success') != null) $('#contactform').slideUp('slow');

			}
		);

		});

		return false;

	});

	//Dropdown menu for mobile	
	$("<select />").appendTo("nav#MenuBar");
	$("<option />", {
	"selected": "selected",
	"value"   : "",
	"text"    : "Select a page..."
	}).appendTo("nav select");

      $("nav#MenuBar a").each(function() {
      	var el = $(this);
		if(el.parents('.dropMenu').length) {
	        $('<option />', {
	            'value': el.attr('href'),
	            'text':  '— ' + el.text()
	        }).appendTo('nav#MenuBar select');
	    } else {
	        $('<option />', {
	            'value': el.attr('href'),
	            'text': el.text()
	        }).appendTo('nav#MenuBar select');
	    }
      });
	
	$("nav#MenuBar select").change(function() {
		window.location = $(this).find("option:selected").val();
	});

	//Ipad Header
	if ( navigator.userAgent.match(/iPad/i)) {
		$('input, textarea').focus(function(){
			$('header').css('position', 'static');
		});
		$('input, textarea').blur(function(){
			$('header').css('position', 'fixed');
		});		
	}
	
	//iPhone, iPad
	if (navigator.userAgent.match(/iPhone/i) || navigator.userAgent.match(/iPad/i)) {
	    var viewportmeta = document.querySelector('meta[name="viewport"]');
	    if (viewportmeta) {
	        viewportmeta.content = 'width=device-width, minimum-scale=1.0, maximum-scale=1.0, initial-scale=1.0';
	        document.body.addEventListener('gesturestart', function () {
	            viewportmeta.content = 'width=device-width, minimum-scale=0.25, maximum-scale=1.6';
	        }, false);
	    }
	}   

});


//Accordion plugin
(function($) {
    $.fn.smoothAccordion = function() {
        this.each(function() {
            var element = this;
            var accordionContent = $(element).find(".accordionCnt");
			var link = $(element).find('.head a');
			var heading = $(element).find(".head h4");
			
			accordionContent.each(function(){
				$main = $(this);
				if ($main.hasClass('active')) {
					$main.show();
					$main.prev().children('h4').addClass('active');
				}
			});
			link.click(function() {
				$cnt =  $(this).parent().parent().next();
				if(!$cnt.hasClass('active')) {
					accordionContent.removeClass('active').slideUp();
					$cnt.removeClass('hide').addClass('active').slideDown();
					heading.removeClass('active');
					$(this).parent().addClass('active');	
				}
				return false;
			});
        })
        return this;
    }
    
})(jQuery);


//Google Maps 
var geocoder;
var map;
function initializeGMap() {
  geocoder = new google.maps.Geocoder();
  var latlng = new google.maps.LatLng(51.513967, -0.153681);
  var mapOptions = {
    zoom: 12,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  }
  map = new google.maps.Map(document.getElementById('map_canvas'), mapOptions);

  var address = $('#map_canvas').attr('data-address');
  if ($('#map_canvas').attr('data-address')) {
  geocoder.geocode( { 'address': address}, function(results, status) {
    if (status == google.maps.GeocoderStatus.OK) {
      map.setCenter(results[0].geometry.location);
      var marker = new google.maps.Marker({
          map: map,
          position: results[0].geometry.location
      });
    } else {
      //alert('Geocode was not successful for the following reason: ' + status);
    }
  });
}
}