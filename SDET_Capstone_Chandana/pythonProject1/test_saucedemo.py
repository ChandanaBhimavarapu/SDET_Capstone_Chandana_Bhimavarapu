import time
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait

# Import necessary functions from selenium_utils module
from selenium_utils import find_element, click_element, verify_text, verify_user, click_Login, click_toggle

@pytest.fixture
def browser():
    driver = webdriver.Chrome()
    driver.maximize_window()
    yield driver
    driver.quit()

def test_saucedemo_scenario(browser):
    # 1. Launch the URL
    browser.get("https://www.saucedemo.com/")

    # 2. Verify SWAG LABS is present on the Web Page
    verify_text(browser, By.CLASS_NAME, "login_logo", "Swag Labs")

    # 3. Enter username and password and click login
    verify_user(browser, By.ID, "user-name", "standard_user")
    verify_user(browser, By.ID, "password", "secret_sauce")
    click_Login(browser, By.ID, "login-button")

    # 4. Add any one item to cart
    click_element(browser, By.CLASS_NAME, "btn_inventory")

    # 5. Click on the cart icon and verify item is added to the cart
    cart_icon = find_element(browser, By.CLASS_NAME, "shopping_cart_link")
    cart_icon.click()
    time.sleep(2)  # Adding a small delay to ensure cart is updated

    # Verifying the item in the cart
    cart_item_count = find_element(browser, By.CLASS_NAME, "shopping_cart_badge").text
    assert cart_item_count == "1"  # Assuming the cart displays the count of items added

    # 6. Click on the menu toggle button
    click_toggle(browser, By.ID, "react-burger-menu-btn")
    time.sleep(1)

    # 7. Click on the Logout button
    logout_button = find_element(browser, By.ID, 'logout_sidebar_link')
    logout_button.click()
