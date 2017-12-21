Compare data ui and api
Story: compare data ui and api
Given [UI] user Open Zomato home page
When [UI] user type restaurant name 'sana sini' on searchbar
And [UI] user click search
Then [UI] user should redirected to restaurant detail page
And [API] comparing data from ui with api data