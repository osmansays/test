<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;com.edurekademo.tutorial.addressbook;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;javax.servlet.annotation.WebServlet;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.annotations.Theme;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.annotations.Title;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.annotations.VaadinServletConfiguration;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.annotations.Widgetset;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.server.VaadinRequest;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.server.VaadinServlet;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">import&nbsp;com.edurekademo.tutorial.addressbook.backend.Contact;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">import&nbsp;com.edurekademo.tutorial.addressbook.backend.ContactService;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.ui.Button;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.ui.HorizontalLayout;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.ui.UI;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.ui.VerticalLayout;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.v7.data.util.BeanItemContainer;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.v7.ui.Grid;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code">import&nbsp;com.vaadin.v7.ui.TextField;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='20'/>20</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='21'/>21</td>
<td class="hits"/>
<td class="code">/*&nbsp;User&nbsp;Interface&nbsp;written&nbsp;in&nbsp;Java.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">&nbsp;*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;Define&nbsp;the&nbsp;user&nbsp;interface&nbsp;shown&nbsp;on&nbsp;the&nbsp;Vaadin&nbsp;generated&nbsp;web&nbsp;page&nbsp;by&nbsp;extending&nbsp;the&nbsp;UI&nbsp;class.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;By&nbsp;default,&nbsp;a&nbsp;new&nbsp;UI&nbsp;instance&nbsp;is&nbsp;automatically&nbsp;created&nbsp;when&nbsp;the&nbsp;page&nbsp;is&nbsp;loaded.&nbsp;To&nbsp;reuse</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;*&nbsp;the&nbsp;same&nbsp;instance,&nbsp;add&nbsp;@PreserveOnRefresh.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">&nbsp;*/</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='27'/>27</td>
<td class="hits">0</td>
<td class="code">@Title("Addressbook")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code">@Theme("valo")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code">@Widgetset("com.vaadin.v7.Vaadin7WidgetSet")</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='30'/>30</td>
<td class="hits">0</td>
<td class="code">public&nbsp;class&nbsp;AddressbookUI&nbsp;extends&nbsp;UI&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='31'/>31</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='32'/>32</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Hundreds&nbsp;of&nbsp;widgets.&nbsp;Vaadin's&nbsp;user&nbsp;interface&nbsp;components&nbsp;are&nbsp;just&nbsp;Java</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;objects&nbsp;that&nbsp;encapsulate&nbsp;and&nbsp;handle&nbsp;cross-browser&nbsp;support&nbsp;and</td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;client-server&nbsp;communication.&nbsp;The&nbsp;default&nbsp;Vaadin&nbsp;components&nbsp;are&nbsp;in&nbsp;the</td>
</tr>
<tr class="noCover">
<td class="line"><a name='36'/>36</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;com.vaadin.ui&nbsp;package&nbsp;and&nbsp;there&nbsp;are&nbsp;over&nbsp;500&nbsp;more&nbsp;in</td>
</tr>
<tr class="noCover">
<td class="line"><a name='37'/>37</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;vaadin.com/directory.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='38'/>38</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='39'/>39</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;TextField&nbsp;filter&nbsp;=&nbsp;new&nbsp;TextField();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='40'/>40</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;Grid&nbsp;contactList&nbsp;=&nbsp;new&nbsp;Grid();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='41'/>41</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;Button&nbsp;newContact&nbsp;=&nbsp;new&nbsp;Button("New&nbsp;contact");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='42'/>42</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='43'/>43</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;ContactForm&nbsp;is&nbsp;an&nbsp;example&nbsp;of&nbsp;a&nbsp;custom&nbsp;component&nbsp;class</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='44'/>44</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;ContactForm&nbsp;contactForm&nbsp;=&nbsp;new&nbsp;ContactForm();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='45'/>45</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='46'/>46</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;ContactService&nbsp;is&nbsp;a&nbsp;in-memory&nbsp;mock&nbsp;DAO&nbsp;that&nbsp;mimics</td>
</tr>
<tr class="noCover">
<td class="line"><a name='47'/>47</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;a&nbsp;real-world&nbsp;datasource.&nbsp;Typically&nbsp;implemented&nbsp;for</td>
</tr>
<tr class="noCover">
<td class="line"><a name='48'/>48</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;example&nbsp;as&nbsp;EJB&nbsp;or&nbsp;Spring&nbsp;Data&nbsp;based&nbsp;service.</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='49'/>49</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;ContactService&nbsp;service&nbsp;=&nbsp;ContactService.createDemoService();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='50'/>50</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='51'/>51</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='52'/>52</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;The&nbsp;"Main&nbsp;method".</td>
</tr>
<tr class="noCover">
<td class="line"><a name='53'/>53</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='54'/>54</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;This&nbsp;is&nbsp;the&nbsp;entry&nbsp;point&nbsp;method&nbsp;executed&nbsp;to&nbsp;initialize&nbsp;and&nbsp;configure&nbsp;the</td>
</tr>
<tr class="noCover">
<td class="line"><a name='55'/>55</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;visible&nbsp;user&nbsp;interface.&nbsp;Executed&nbsp;on&nbsp;every&nbsp;browser&nbsp;reload&nbsp;because&nbsp;a&nbsp;new</td>
</tr>
<tr class="noCover">
<td class="line"><a name='56'/>56</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;instance&nbsp;is&nbsp;created&nbsp;for&nbsp;each&nbsp;web&nbsp;page&nbsp;loaded.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='57'/>57</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='58'/>58</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='59'/>59</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;void&nbsp;init(VaadinRequest&nbsp;request)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='60'/>60</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;configureComponents();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='61'/>61</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;buildLayout();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='62'/>62</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='63'/>63</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='64'/>64</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;void&nbsp;configureComponents()&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='65'/>65</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='66'/>66</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Synchronous&nbsp;event&nbsp;handling.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='67'/>67</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='68'/>68</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Receive&nbsp;user&nbsp;interaction&nbsp;events&nbsp;on&nbsp;the&nbsp;server-side.&nbsp;This&nbsp;allows&nbsp;you</td>
</tr>
<tr class="noCover">
<td class="line"><a name='69'/>69</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;to&nbsp;synchronously&nbsp;handle&nbsp;those&nbsp;events.&nbsp;Vaadin&nbsp;automatically&nbsp;sends&nbsp;only</td>
</tr>
<tr class="noCover">
<td class="line"><a name='70'/>70</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;the&nbsp;needed&nbsp;changes&nbsp;to&nbsp;the&nbsp;web&nbsp;page&nbsp;without&nbsp;loading&nbsp;a&nbsp;new&nbsp;page.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='71'/>71</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='72'/>72</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;newContact.addClickListener(e&nbsp;-&gt;&nbsp;contactForm.edit(new&nbsp;Contact()));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='73'/>73</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='74'/>74</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;filter.setInputPrompt("Filter&nbsp;contacts...");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='75'/>75</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;filter.addTextChangeListener(e&nbsp;-&gt;&nbsp;refreshContacts(e.getText()));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='76'/>76</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='77'/>77</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='78'/>78</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.setContainerDataSource(new&nbsp;BeanItemContainer&lt;&gt;(Contact.class));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='79'/>79</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.setColumnOrder("firstName",&nbsp;"lastName",&nbsp;"email");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='80'/>80</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.removeColumn("id");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='81'/>81</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.removeColumn("birthDate");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='82'/>82</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.removeColumn("phone");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='83'/>83</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.setSelectionMode(Grid.SelectionMode.SINGLE);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='84'/>84</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.addSelectionListener(</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='85'/>85</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e&nbsp;-&gt;&nbsp;contactForm.edit((Contact)&nbsp;contactList.getSelectedRow()));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='86'/>86</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;refreshContacts();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='87'/>87</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='88'/>88</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='89'/>89</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='90'/>90</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Robust&nbsp;layouts.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='91'/>91</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='92'/>92</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Layouts&nbsp;are&nbsp;components&nbsp;that&nbsp;contain&nbsp;other&nbsp;components.&nbsp;HorizontalLayout</td>
</tr>
<tr class="noCover">
<td class="line"><a name='93'/>93</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;contains&nbsp;TextField&nbsp;and&nbsp;Button.&nbsp;It&nbsp;is&nbsp;wrapped&nbsp;with&nbsp;a&nbsp;Grid&nbsp;into</td>
</tr>
<tr class="noCover">
<td class="line"><a name='94'/>94</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;VerticalLayout&nbsp;for&nbsp;the&nbsp;left&nbsp;side&nbsp;of&nbsp;the&nbsp;screen.&nbsp;Allow&nbsp;user&nbsp;to&nbsp;resize&nbsp;the</td>
</tr>
<tr class="noCover">
<td class="line"><a name='95'/>95</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;components&nbsp;with&nbsp;a&nbsp;SplitPanel.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='96'/>96</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='97'/>97</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;In&nbsp;addition&nbsp;to&nbsp;programmatically&nbsp;building&nbsp;layout&nbsp;in&nbsp;Java,&nbsp;you&nbsp;may&nbsp;also</td>
</tr>
<tr class="noCover">
<td class="line"><a name='98'/>98</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;choose&nbsp;to&nbsp;setup&nbsp;layout&nbsp;declaratively&nbsp;with&nbsp;Vaadin&nbsp;Designer,&nbsp;CSS&nbsp;and&nbsp;HTML.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='99'/>99</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='100'/>100</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;void&nbsp;buildLayout()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='101'/>101</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HorizontalLayout&nbsp;actions&nbsp;=&nbsp;new&nbsp;HorizontalLayout(filter,&nbsp;newContact);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='102'/>102</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;actions.setWidth("100%");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='103'/>103</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;filter.setWidth("100%");</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='104'/>104</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;actions.setExpandRatio(filter,&nbsp;1);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='105'/>105</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='106'/>106</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;VerticalLayout&nbsp;left&nbsp;=&nbsp;new&nbsp;VerticalLayout(actions,&nbsp;contactList);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='107'/>107</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;left.setSizeFull();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='108'/>108</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.setSizeFull();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='109'/>109</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;left.setExpandRatio(contactList,&nbsp;1);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='110'/>110</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='111'/>111</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HorizontalLayout&nbsp;mainLayout&nbsp;=&nbsp;new&nbsp;HorizontalLayout(left,&nbsp;contactForm);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='112'/>112</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainLayout.setSizeFull();</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='113'/>113</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainLayout.setExpandRatio(left,&nbsp;1);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='114'/>114</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='115'/>115</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;//&nbsp;Split&nbsp;and&nbsp;allow&nbsp;resizing</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='116'/>116</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setContent(mainLayout);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='117'/>117</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='118'/>118</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='119'/>119</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='120'/>120</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Choose&nbsp;the&nbsp;design&nbsp;patterns&nbsp;you&nbsp;like.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='121'/>121</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='122'/>122</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;It&nbsp;is&nbsp;good&nbsp;practice&nbsp;to&nbsp;have&nbsp;separate&nbsp;data&nbsp;access&nbsp;methods&nbsp;that&nbsp;handle&nbsp;the</td>
</tr>
<tr class="noCover">
<td class="line"><a name='123'/>123</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;back-end&nbsp;access&nbsp;and/or&nbsp;the&nbsp;user&nbsp;interface&nbsp;updates.&nbsp;You&nbsp;can&nbsp;further&nbsp;split</td>
</tr>
<tr class="noCover">
<td class="line"><a name='124'/>124</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;your&nbsp;code&nbsp;into&nbsp;classes&nbsp;to&nbsp;easier&nbsp;maintenance.&nbsp;With&nbsp;Vaadin&nbsp;you&nbsp;can&nbsp;follow</td>
</tr>
<tr class="noCover">
<td class="line"><a name='125'/>125</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;MVC,&nbsp;MVP&nbsp;or&nbsp;any&nbsp;other&nbsp;design&nbsp;pattern&nbsp;you&nbsp;choose.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='126'/>126</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='127'/>127</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;void&nbsp;refreshContacts()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='128'/>128</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;refreshContacts(filter.getValue());</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='129'/>129</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='130'/>130</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='131'/>131</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;void&nbsp;refreshContacts(String&nbsp;stringFilter)&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='132'/>132</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactList.setContainerDataSource(new&nbsp;BeanItemContainer&lt;&gt;(</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='133'/>133</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact.class,&nbsp;service.findAll(stringFilter)));</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='134'/>134</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;contactForm.setVisible(false);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='135'/>135</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='136'/>136</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='137'/>137</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;/*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='138'/>138</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;Deployed&nbsp;as&nbsp;a&nbsp;Servlet&nbsp;or&nbsp;Portlet.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='139'/>139</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</td>
</tr>
<tr class="noCover">
<td class="line"><a name='140'/>140</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;You&nbsp;can&nbsp;specify&nbsp;additional&nbsp;servlet&nbsp;parameters&nbsp;like&nbsp;the&nbsp;URI&nbsp;and&nbsp;UI&nbsp;class</td>
</tr>
<tr class="noCover">
<td class="line"><a name='141'/>141</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;name&nbsp;and&nbsp;turn&nbsp;on&nbsp;production&nbsp;mode&nbsp;when&nbsp;you&nbsp;have&nbsp;finished&nbsp;developing&nbsp;the</td>
</tr>
<tr class="noCover">
<td class="line"><a name='142'/>142</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;application.</td>
</tr>
<tr class="noCover">
<td class="line"><a name='143'/>143</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*/</td>
</tr>
<tr class="noCover">
<td class="line"><a name='144'/>144</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@WebServlet(urlPatterns&nbsp;=&nbsp;"/*")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='145'/>145</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@VaadinServletConfiguration(ui&nbsp;=&nbsp;AddressbookUI.class,&nbsp;productionMode&nbsp;=&nbsp;false)</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='146'/>146</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;class&nbsp;MyUIServlet&nbsp;extends&nbsp;VaadinServlet&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='147'/>147</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='148'/>148</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='149'/>149</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
