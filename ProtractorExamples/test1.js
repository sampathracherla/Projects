describe('google images homepage', function() {
      it('go to google images page', function() {
		  browser.driver.get('https://images.google.com/?gws_rd=ssl');
          browser.driver.findElement(by.name('q')).sendKeys('hills');
		  browser.driver.findElement(by.name('btnG')).click();
		  browser.driver.findElement(by.name('yUUQhHPLNLSfvM:')).click();
		  browser.driver.sleep(10000);
		});
});