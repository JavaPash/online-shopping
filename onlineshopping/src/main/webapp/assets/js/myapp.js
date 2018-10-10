$(function(){
	
	switch(menu)
	{
		case 'About':
						$('#About').addClass('nav-item active');
						break;
		case 'Contact':
						$('#Contact').addClass('nav-item active');
						break;
					
		default:
						$('#Home').addClass('nav-item active');
						break;	
	}
	
	
	
	
});