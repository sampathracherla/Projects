describe('google images homepage', function() {
      it('go to google images page', function() {
		  browser.driver.get('https://www.google.com/');
		  browser.driver.manage().window().maximize();
          browser.driver.findElement(by.name('q')).sendKeys('QA Manager');
		  browser.driver.findElement(by.className('btn btn-primary btn-lg btn-block')).click();
		  browser.driver.findElement(by.id('sort-by-date-link')).click();
		  browser.driver.sleep(100000);
		});
});

