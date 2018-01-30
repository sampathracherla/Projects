
describe ('test zoo site for input field', function() {

it ('to test input field and check text output', function(){
 browser.get('www.thetestroom.com/jswebapp/');
 element(by.model('person.name')).sendKeys('I will enter this text file');
 element(by.binding('person.name')).getText().then(function(text)
	{
	   console.log(text);
});

 element(by.buttonText('CONTINUE')).click();
 element(by.model('animal')).$('[value="1"]').click();
 element(by.buttonText('CONTINUE')).click();
 
});
});